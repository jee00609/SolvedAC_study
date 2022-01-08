import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
      FastReader fr = new FastReader(); // 문제 해결 소스 코드
      String a = fr.nextLine();
      String b = fr.nextLine();
      
      int a0 = Integer.parseInt(a);
      int a1 = Integer.parseInt(a.substring(0,1));
      int a2 = Integer.parseInt(a.substring(1,2));
      int a3 = Integer.parseInt(a.substring(2,3));


      int b0 = Integer.parseInt(b);
      int b1 = Integer.parseInt(b.substring(0,1));
      int b2 = Integer.parseInt(b.substring(1,2));
      int b3 = Integer.parseInt(b.substring(2,3));

      System.out.println(a0*b3);
      System.out.println(a0*b2);
      System.out.println(a0*b1);

      System.out.println(a0*b0);


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