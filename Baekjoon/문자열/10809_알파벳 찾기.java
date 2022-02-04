import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader(); 
      String abc = "abcdefghijklmnopqrstuvwxyz";
      String []abc_list = abc.split("");

      String input = fr.nextLine();
      String []input_list = input.split("");
      // Set<String> set = new HashSet<String>(Arrays.asList(input_list));
      // input_list = set.toArray(new String[0]);

      HashMap<Integer,String> abcMap = new HashMap<Integer,String>(){};
      StringBuffer sb = new StringBuffer();

      for (int i = 0 ; i<abc_list.length; i++){
        abcMap.put(i, abc_list[i]);
      }

      for(int i =0; i < abcMap.size(); i++){
        String temp = abcMap.get(i);
        boolean isthere = true;
        for (int j = 0 ; j < input_list.length; j++){
          isthere = true;
          if(input_list[j].equals(temp)){
            sb.append(j);
            sb.append(" ");
            break;
          }
          else{
            isthere = false;
          }
        }
        if(isthere == false){
          sb.append(-1);
          sb.append(" ");
        }
      }


      System.out.println(sb.toString());

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