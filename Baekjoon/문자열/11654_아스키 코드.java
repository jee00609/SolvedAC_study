import java.util.*;
import java.io.*;

//StandardCharsets.US_ASCII) 사용을 위해
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); 

      String input = fr.nextLine();
      byte[] byte_string = input.getBytes(StandardCharsets.US_ASCII);
      
      System.out.println(byte_string[0]);

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