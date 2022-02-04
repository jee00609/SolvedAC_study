import java.util.*;
import java.io.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader();

      String input = fr.nextLine();
      String []num = input.split(" ");

      for (int i = 0 ; i < num.length; i++){
        StringBuffer sb = new StringBuffer(num[i]);
        String temp = sb.reverse().toString();
        num[i] = temp;
      }

      int num1 = Integer.parseInt(num[0]);
      int num2 = Integer.parseInt(num[1]);

      if(num1>num2){
        System.out.println(num[0]);
      }
      else{
        System.out.println(num[1]);
      }


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