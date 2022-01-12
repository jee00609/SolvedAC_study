import java.util.*;
import java.io.*;

import java.io.BufferedWriter;

public class Main {
    //error : unreported exception IOException; must be caught or declared to be thrown
    //BufferedReader나 BufferedWriter를 사용할 때에는 IO 예외처리를 해줘야 한다. 버퍼를 사용하기 때문인 것으로 보인다.
    //throws IOException 써주자
    public static void main(String[] args)throws IOException {
      FastReader fr = new FastReader(); // 문제 해결 소스 코드
      int num = fr.nextInt();
      int i = 0;
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      for(i=0;i<num;i++){
        
        int a = fr.nextInt();
        int b = fr.nextInt();
        int result = a+b;
        bw.write("Case #"+String.valueOf(i+1)+": "+String.valueOf(result)+"\n");
      }

      bw.flush();
      bw.close();


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