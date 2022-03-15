import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Integer T = Integer.parseInt(br.readLine());
    StringBuilder result = new StringBuilder();

    for (Integer i = 0; i < T; i ++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      Integer R = Integer.parseInt(st.nextToken());
      String S = st.nextToken();
      result.append(multiply(R, S) + "\n");
    }
    System.out.println(result);    
  }
  public static StringBuilder multiply(Integer R, String S) {
    StringBuilder result = new StringBuilder();

    for (Integer i = 0; i < S.length(); i++) {
      result.append((S.charAt(i)+"").repeat(R));
    }
    return result;
  }
}