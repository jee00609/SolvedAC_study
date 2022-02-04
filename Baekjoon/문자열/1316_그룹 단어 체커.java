import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader();

      int num = fr.nextInt();
      int result = 0;
      
      for (int i = 0; i< num; i++){
        String input = fr.nextLine();
        String []input_list = input.split("");
        ArrayList<String> duplicate_num = new ArrayList<>();
        
        if(input_list.length==1){
          result+=1;
        }
        else{
          for(int j = 0; j < input_list.length;j++){

            if((j+1<=input_list.length-1)&&(!input_list[j].equals(input_list[j+1]))){

              String temp = input_list[j];
              duplicate_num.add(temp);
            }
            else if((j+1<=input_list.length-1)&&(input_list[j].equals(input_list[j+1]))){
              HashMap<String, Integer> map = new HashMap<>();
              for(String key : duplicate_num) {
                map.put(key, map.getOrDefault(key, 0)+1);
              }

              boolean isGroup = true;

              for (String key : map.keySet()){
                if(key.equals(input_list[j])){
                  isGroup = false;
                }
              }

              if (isGroup == false){
                String temp = input_list[j];
                duplicate_num.add(temp);
              }
            }
            else{
              if(!input_list[input_list.length-1].equals(input_list[input_list.length-2])){
                String temp = input_list[input_list.length-1];
                duplicate_num.add(temp);
              }
            }
          }


          HashMap<String, Integer> map = new HashMap<>();
          for(String key : duplicate_num) {
            map.put(key, map.getOrDefault(key, 0)+1);
          }

          boolean isGroup = true;

          for (String key : map.keySet()){
            Integer value = map.get(key);
            if(value!=1){
              isGroup = false;
            }
          }


          if(isGroup == true){
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