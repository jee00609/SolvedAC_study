import java.util.*;
import java.io.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); // 문제 해결 소스 코드

      int num = fr.nextInt();
      double user_input = 0.000000;

      ArrayList<Double> array_list = new ArrayList<>();
      ArrayList<Integer> array_list_int = new ArrayList<>();
      ArrayList<Double> new_array_list = new ArrayList<>();

      for(int i = 0 ; i<num;i++){
        user_input = fr.nextDouble();
        array_list.add(user_input);
        array_list_int.add((int)user_input);
      }

      int high_score = Collections.max(array_list_int);

      double manufacture_score = 0.000000;
      double average = 0.000000;

      double sum = 0.000000;

      for(int i = 0 ; i<num;i++){
        manufacture_score = array_list.get(i)/high_score*100;
        sum += manufacture_score;

        new_array_list.add(manufacture_score);
      }

      average = sum/num;
      //System.out.println(String.format("%.5f", average));
      System.out.println(average);

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