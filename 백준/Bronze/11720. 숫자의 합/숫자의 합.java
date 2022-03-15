import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Integer N = Integer.parseInt(br.readLine());
    StringBuilder number = new StringBuilder(br.readLine());
    Integer result = 0;
      
    for(Integer i = 0; i < N; i++) {
      result += Integer.parseInt(number.charAt(i) + "");
    }

    System.out.println(result);
  }
}