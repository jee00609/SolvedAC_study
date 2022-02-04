import java.util.*;
import java.io.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader();

      String input = fr.nextLine();
      String []word = input.split("");
      int result = 0;

      //map 선언
      Map<String, Integer> map = new HashMap<String, Integer>() {{
          put("A", 2);
          put("B", 2);
          put("C", 2);

          put("D", 3);
          put("E", 3);
          put("F", 3);

          put("G", 4);
          put("H", 4);
          put("I", 4);

          put("J", 5);
          put("K", 5);
          put("L", 5);

          put("M", 6);
          put("N", 6);
          put("O", 6);

          put("P", 7);
          put("Q", 7);
          put("R", 7);
          put("S", 7);

          put("T", 8);
          put("U", 8);
          put("V", 8);

          put("W", 9);
          put("X", 9);
          put("Y", 9);
          put("Z", 9);
      }};


      for(int i = 0 ; i < word.length; i++){
        for (String key : map.keySet()){
          if(word[i].equals(key)){

            Integer value = map.get(key);

            result += value;
          }
        }
      }

      result += word.length;

      System.out.println(result);


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