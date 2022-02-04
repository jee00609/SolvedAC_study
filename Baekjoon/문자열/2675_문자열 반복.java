import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
      FastReader fr = new FastReader();

      String cnt_word = null;
      ArrayList <String> cnt_word_array = new ArrayList<String>();
      String []cnt_word_temp = null;

      int cnt= 0;
      String []word = null;

      String result = "";
      ArrayList <String> result_array = new ArrayList<String>();

      int num = fr.nextInt();

      for ( int i = 0 ; i< num; i++){
        cnt_word = fr.nextLine();
        cnt_word_array.add(cnt_word);
      }

      for ( int i = 0 ; i< cnt_word_array.size(); i++){
        // 한줄로 입력받은 문자열을 띄어쓰기로 구별해서 저장
        cnt_word_temp = cnt_word_array.get(i).split(" ");
        //index 0 은 숫자
        cnt = Integer.parseInt(cnt_word_temp[0]);
        //index 1 로 받았던 문자열에서 앞에 있을 공백 제거
        cnt_word_temp[1] = cnt_word_temp[1].replace(" ", "");
        // 공백을 제거한 문자열을 한글자씩 저장
        word = cnt_word_temp[1].split("");
        result = "";

        for(int j = 0; j<word.length;j++){
          for(int k = 0 ; k < cnt;k++){
            //한글자씩 cnt 만큼 반복하고 새로운 단어로 바꾼다음 반복
            result+=word[j];
          }
        }
        //완성된 하나의 답안을 array에 저장
        result_array.add(result);
      }

      //저장한 답안을 한꺼번에 출력
      for(int i = 0 ; i < result_array.size();i++){
        System.out.println(result_array.get(i));
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