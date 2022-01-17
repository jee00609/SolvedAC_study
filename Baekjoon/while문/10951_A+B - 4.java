import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); // 문제 해결 소스 코드

      int a = fr.nextInt();
      int b = fr.nextInt();

      ArrayList<Integer> result = new ArrayList<>();

      try{
        while((a<10) || (b<10)){
          int sum = a+b;
          result.add(sum);
          a = fr.nextInt();
          b = fr.nextInt();
        }
        for (int i = 0; i < result.size(); i++){
          System.out.println(result.get(i));
        }
      }catch(Exception e){
        for (int i = 0; i < result.size(); i++){
          System.out.println(result.get(i));
        }
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