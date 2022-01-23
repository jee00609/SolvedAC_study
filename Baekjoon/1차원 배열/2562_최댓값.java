import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); // 문제 해결 소스 코드
      ArrayList<Integer> arrayList = new ArrayList<>();

      for (int i = 0;i<9;i++){
        int x = fr.nextInt();
        arrayList.add(x);
      }
      
      int max = (int)-1e9;
      int maxIndex = 0;

      for (int i =0;i < 9;i++){
        if (max<arrayList.get(i)){
          max = arrayList.get(i);
          maxIndex = i+1;
        }
      }
      System.out.println(max+"\n"+maxIndex);


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