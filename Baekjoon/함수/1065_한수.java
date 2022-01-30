import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); 

      int input = fr.nextInt();
      int han = 0;
      //3자리 수
      int []for_three = new int[3];

      for(int i=1; i<=input;i++){
        if(i<100){
          han+=1;
        }
        //입력값 제한 첫째 줄에 1,000보다 작거나 같은 자연수 N 조건을 바탕으로 효율성을 위해 작성
        else if(i==1000){
          break;
        }
        // 3자리수
        else{
          int k =0;
          int t = i;
          
          while(t>0){
            //각 자리 수를 박아 준다.
            for_three[k] = t%10;
            t/=10;
            k+=1;
          }
          //등차 수열 확인
          if(for_three[0]-for_three[1]==for_three[1]-for_three[2]){
            han+=1;
          }

        }
      }
      System.out.println(han);

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