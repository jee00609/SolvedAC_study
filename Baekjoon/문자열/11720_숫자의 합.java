import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); 

      //솔직히 문제 상으로는 num 의 값만큼 새로 배열을 잡고 문제를 풀란 것 같지만
      //쉽게쉽게 split 과 ArrayList 를 이용해서 문제를 풀었다.
      //따라서 나의 코드 같은 경우 num 이 필요없으며 string input 의 길이 또한 상관 없이 돌아간다.
      int num = fr.nextInt();
      String input = fr.nextLine();
      ArrayList<Integer> array_list = new ArrayList<>();

      String []input_list = input.split("");
      int sum = 0 ;


      for(int i = 0 ; i < input_list.length;i++){
        array_list.add(Integer.parseInt(input_list[i]));
      }
      for(int i = 0; i<array_list.size();i++){
        sum+= array_list.get(i);
      }

      System.out.println(sum);
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