package gradle.wrapper.backjoon.Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue<E> implements Queue<E> {
    private static final int DEFAULT_CAPCITY = 64; //최소 용적 크기

    private Object[] array;	// 요소를 담을 배열
    private int size;	// 요소 개수

    private int front;	// 시작 인덱스를 가리키는 변수(빈 공간임을 유의)
    private int rear;	// 마지막 요소의 인덱스를 가리키는 변수
    // 생성자1 (초기 용적 할당을 안할 경우)

    public ArrayQueue() {
        this.array = new Object[DEFAULT_CAPCITY];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    // 생성자2 (초기 용적 할당을 할 경우)
    public ArrayQueue(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }
    private void resize(int newCapacity) {

        int arrayCapacity = array.length; // 현재 용적 크기

        Object[] newArray = new Object[newCapacity]; // 용적을 변경한 배열

        /*
         * i = new array index
         * j = original array
         * index 요소 개수(size)만큼 새 배열에 값 복사
         */
        for (int i = 1, j = front + 1; i <= size; i++, j++) {
            newArray[i] = array[j % arrayCapacity];
        }

        this.array = null;
        this.array = newArray; // 새 배열을 기존 array의 배열로 덮어씌움

        front = 0;
        rear = size;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override //현재 찾고자 하는 요소에 큐가 들어있는지를 확인
    public boolean contains(Object value) {
        int start = (front + 1) % array.length;

        /**
         *  i : 요소 개수만큼만 반복한다.
         *  idx : 원소 위치로, 매 회 (idx + 1) % array.length; 의 위치로 갱신
         */
        for(int i = 0, idx = start; i < size; i++, idx = (idx + 1) % array.length) {
            if(array[idx].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        E item = poll();

        if(item == null) {
            throw new NoSuchElementException();
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() { //큐 내에 모든 요소를 지워버린다.

        for(int i = 0; i < array.length; i++) {
            array[i] = null;
        }

        front = rear = size = 0;
    }

    @Override
    public boolean offer(E item) {

        // 용적이 가득 찼을 경우
        if((rear + 1) % array.length == front) {
            resize(array.length * 2);	// 용적을 두 배 늘려준다.
        }

        rear = (rear + 1) % array.length;	// rear을 rear의 다음 위치로 갱신

        array[rear] = item;
        size++;	// 사이즈 1 증가

        return true;
    }

    @Override
    public E remove() {
        E item = poll();

        if(item == null) {
            throw new NoSuchElementException();
        }

        return item;
    }

    @Override
    public E poll() {
        if(size == 0) {	// 삭제할 요소가 없을 경우 null 반환
            return null;
        }

        front = (front + 1) % array.length; // front 를 한 칸 옮긴다.

        @SuppressWarnings("unchecked")
        E item = (E) array[front];	// 반환할 데이터 임시 저장

        array[front] = null;	// 해당 front의 데이터 삭제
        size--;	// 사이즈 감소


        // 용적이 최소 크기(64)보다 크고 요소 개수가 1/4 미만일 경우
        if(array.length > DEFAULT_CAPCITY && size < (array.length / 4)) {

            // 아무리 작아도 최소용적 미만으로 줄이지는 않도록 한다.
            resize(Math.max(DEFAULT_CAPCITY, array.length / 2));
        }

        return item;
    }

    @Override
    public E element() {
        E item = peek();

        if(item == null) {
            throw new NoSuchElementException();
        }
        return item;
    }

    @Override
    public E peek() {
        // 요소가 없을 경우 null 반환
        if(size == 0) {
            return null;
        }

        @SuppressWarnings("unchecked")
        E item = (E) array[(front + 1) % array.length]; //E타입으로 형 변환
        return item;
    }
}
