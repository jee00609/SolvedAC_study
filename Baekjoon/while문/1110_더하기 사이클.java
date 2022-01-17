import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); // 문제 해결 소스 코드

      //입력을 받는다.
      int user_input = fr.nextInt();

      //십의 자리 수
      int ten = 0;
      //일의 자리 수
      int one = 0;
      // 새로운 수
      // 초기화는 유저의 입력 값으로 초기화를 해준다.
      int sum = user_input;
      //사이클 횟수
      int cnt = 0;

      while(true){
        //십의 자리 수 구한다.
        ten = sum/10;
        //일의 자리 수 구한다.
        one = sum%10;

        //1. 새로운 수 = 십의 자리 수 + 일의 자리 수
        sum = ten + one;

        // 일의 자리 수를 10으로 곱해서 십의 자리 수로 만든 다음
        // 새로운 수의 나머지를 더해서
        // 최종 새로운 수를 제작
        sum = one*10 + sum%10;
        cnt++;
        if(user_input == sum){
          break;
        }

      }

      System.out.println(cnt);

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