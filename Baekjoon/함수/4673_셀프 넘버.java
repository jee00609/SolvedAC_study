import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      //FastReader fr = new FastReader(); // 문제 해결 소스 코드

      ArrayList<Integer> result = new ArrayList<>();
      //1부터 10000을 위해 10001로 초기화
      int size = 10001;
      //기본적으로 flase 로 초기화
      boolean[] chk = new boolean[size];

      for(int i = 0; i<chk.length;i++){
        int num = SelfNum(i);
        
        //10000 을 넘으면 안됨
        if(num<10001){
          chk[num]=true;
        }

      }

      StringBuilder sb = new StringBuilder();
        
      for (int i = 1; i < 10001; i++) {
        // false 인 인덱스만 출력
        if (!chk[i]) {
          sb.append(i).append('\n');
        }
      }
      System.out.println(sb);




    }

    public static int SelfNum(int number){     
      //sum 을 num 으로 초기화해준다.
      int sum = number;
      //각 자리수를 더해주기 위해서 나머지 연산자와 나눗셈 연산자로 10 단위씩 number 을 줄여 갈 것이기 때문에 number 가 0 이 아닐 때 까지 계속 반복
      while(number != 0){
        //첫 째 자리수를 더해준다.
        sum += number%10;
        // 10을 나누어 첫 째 자리 삭제
        number = number/10;
      }
      return sum;
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}