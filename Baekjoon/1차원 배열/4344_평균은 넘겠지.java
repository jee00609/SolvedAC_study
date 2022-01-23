import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); // 문제 해결 소스 코드
      int testCase = fr.nextInt();

      for (int i =0; i<testCase; i++){

        int n = fr.nextInt();
        int [] arr = new int[n];


        for (int j =0;j<n;j++){
          arr[j]=fr.nextInt();
        }
        int sum = 0;
        for (int j = 0; j<n;j++){
          sum+=arr[j];
        }
        double avg = (double)sum/n;
        double cnt = 0;


        for (int j=0;j<n;j++){
          if (avg<arr[j])cnt++;
        }

        String result = String.format("%.3f",(cnt*100)/n);
        System.out.println(result+"%");

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