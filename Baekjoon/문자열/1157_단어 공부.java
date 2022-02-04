import java.util.*;
import java.io.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader();

      String input = fr.nextLine();
      input = input.toUpperCase();

      //map 선언
      Map<String, Integer> map = new HashMap<String, Integer>();

      String []word = input.split("");
      int high = 0;

      ArrayList <String> result = new ArrayList<String>();

      //이 코드는 Python 의 map 과 비슷하다 꼭 다시 한번 확인하자
      for(String key : word) {
        map.put(key, map.getOrDefault(key, 0)+1);
      }

      for (String key : map.keySet()){
        Integer value = map.get(key);
        if (high < value){
          high = value;
        }
      }

      for (String key : map.keySet()){
        Integer value = map.get(key);
        if (value == high){
          result.add(key);
        }
      }

      if(result.size()>1){
        System.out.println("?");
      }
      else{
        System.out.println(result.get(0));
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