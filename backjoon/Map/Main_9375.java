package backjoon.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main_9375 {
    /*
    <백준 9375- 패션왕 신해빈>
    해빈이는 패션에 매우 민감해서 한번 입었던 옷들의 조합을 절대 다시 입지 않는다. 예를 들어 오늘 해빈이가 안경, 코트, 상의, 신발을 입었다면, 다음날은 바지를
    추가로 입거나 안경대신 렌즈를 착용하거나 해야한다. 해빈이가 가진 의상들이 주어졌을때 과연 해빈이는 알몸이 아닌 상태로 며칠동안 밖에 돌아다닐 수 있을까?
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); //테스트케이스


        if( T--> 0){//테스트 케이스가 존재하지 않을 경우
            HashMap<String,Integer> hm = new HashMap<>(); //<종류, 갯수>
            int ans = Integer.parseInt(br.readLine()); // 입력받은 옷의 갯수

            while(ans --> 0){ //입을 수 있는 경우의 수가 0이 될 때 까지 반복
                StringTokenizer st = new StringTokenizer(br.readLine()," "); //중간에 띄어쓰기 포함하기 위함
                st.nextToken(); //옷 이름->문제 푸는데 있어서 중요하지 않다. 옷 종류만 구별되는 것이 중요하다.
                String kind = st.nextToken(); // 옷 종류

                if(hm.containsKey(kind)){   // Map에 해당 key가 포함된다면,
                    hm.put(kind,hm.get(kind) + 1);//key(종류)의 value(갯수)에 +1을 한다.
                }else{  //Map에 해당 key가 존재하지 않다면,
                    hm.put(kind,1); //key(종류)를 넣어주고, 갯수 1개를 추가한다.
                }
            }
            int result = 1; //곱해야 하기 때문에 1로 설정(0으로 초기화하면 무조건 0이 나오기 때문이다)

            for(int val : hm.values()){
                result *= (val + 1); //안입는 경우도 고려하여 각 종류별 옷의 갯수를 1 증가시켜서 곱해준다.
            }
            System.out.println(result -1); //최종적으로 경우의 수를 추출할 땐 아무것도 안입는 경우를 1개 빼준다.
        }

    }

}
