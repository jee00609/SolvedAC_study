//질문 있으면 
//https://app.sli.do/event/wUjWoPefTFpV5YPq1Fu2TZ/live/questions

//버퍼드 리더 -> https://github.com/ndb796/BOJ_Java/blob/main/Main.java

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); // 문제 해결 소스 코드
      int num = fr.nextInt();
      int judge = fr.nextInt();

      ArrayList<Integer> result = new ArrayList<>();

      for (int i =0; i < num; i++){
        int temp = fr.nextInt();
        if (temp < judge){
          result.add(temp);
        }
      }

      for (int i = 0; i<result.size();i++){
        System.out.print(result.get(i)+" ");
      }
       System.out.println();


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