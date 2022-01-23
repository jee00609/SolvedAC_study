import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); // 문제 해결 소스 코드

      ArrayList<Integer> result = new ArrayList<>();

      int num = fr.nextInt();
      String input = "";
      String[] input_list;
      int sum = 0;

      for(int i=0; i<num;i++){
        input = fr.nextLine();
        sum = 0;
        input_list = input.split("X");
        for(int j = 0; j<input_list.length;j++){
          //System.out.println(input_list[j]);
          int temp = input_list[j].length();
          for (int k = temp; k>0;k--){
            sum += k;
          }
        }


        result.add(sum);
        //System.out.println();
      }

      for(int i = 0; i<num;i++){
        System.out.println(result.get(i));
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