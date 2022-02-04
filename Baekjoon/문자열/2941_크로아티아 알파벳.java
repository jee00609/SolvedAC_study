import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader();

      String input = fr.nextLine();
      String []input_list = input.split("");

      int last = input_list.length;

      int result = 0;

      for(int i = 0; i < input_list.length; i++){
        if(input_list.length == 1){
          result+=1;
          break;
        }
        else{
          String word = input_list[i];

          if(word.equals("c")){
            if((i+1 <= last-1 )&&(input_list[i+1].equals("="))){
              result+=1;
              i++;
            }
            else if((i+1 <= last-1 )&&(input_list[i+1].equals("-"))){
              result+=1;
              i++;
            }
            else{
              result+=1;
            }
          }
          else if(word.equals("d")){
            if((i+1 <= last-1)&&(input_list[i+1].equals("-"))){
              result+=1;
              i++;
            }
            else if((i+2<=last-1)&&(input_list[i+1].equals("z"))&&(input_list[i+2].equals("="))){
              result+=1;
              i+=2;
            }
            else{
              result+=1;
            }

          }
          else if(word.equals("l")){
            if((i+1 <= last-1 )&&(input_list[i+1].equals("j"))){
              result+=1;
              i++;
            }
            else{
              result+=1;
            }

          }
          else if(word.equals("n")){
            if((i+1 <= last-1 )&&(input_list[i+1].equals("j"))){
              result+=1;
              i++;
            }
            else{
              result+=1;
            }
          }
          else if(word.equals("s")){
            if((i+1 <= last-1 )&&(input_list[i+1].equals("="))){
              result+=1;
              i++;
            }
            else{
              result+=1;
            }
          }
          else if(word.equals("z")){
            if((i+1 <= last-1 )&&(input_list[i+1].equals("="))){
              result+=1;
              i++;
            }
            else{
              result+=1;
            }
          }
          else{
            result+=1;
          }


        }
      }

      System.out.println(result);

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