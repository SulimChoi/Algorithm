import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine().strip();
    
    if (str.length() == 0) {
      System.out.println(0);
    }
    else {
      System.out.println(str.split(" ").length);
    }

    
  }
}