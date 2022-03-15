import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String line = br.readLine();
    int num = 0;

    while(!(line.equals("0 0 0"))){
      num ++;
      StringTokenizer st = new StringTokenizer(line);
      int L = Integer.parseInt(st.nextToken());
      int P = Integer.parseInt(st.nextToken());
      int V = Integer.parseInt(st.nextToken());
      int result = ((V / P) * L) + Math.min((V % P), L);

      bw.write("Case "+ num + ": " + result + "\n");
      
      line = br.readLine();
    } 
    bw.flush();
    bw.close();
  }
}