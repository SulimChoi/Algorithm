import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder input = new StringBuilder(br.readLine());
    String inputString = input.reverse().toString();
    Integer A = Integer.parseInt(inputString.split(" ")[0]);
    Integer B = Integer.parseInt(inputString.split(" ")[1]);
    
    System.out.printf("%d\n", A > B ? A : B);
  }
}