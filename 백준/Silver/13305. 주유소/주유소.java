import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    long[] lengths = new long[N-1];
    long[] wons = new long[N];
    long result = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i=0; i < N-1; i++){
      lengths[i] = Long.parseLong(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for (int i=0; i < N; i++){
      wons[i] = Long.parseLong(st.nextToken());
    }

    long minCost = wons[0];

    for(int i = 0; i < N-1; i++){
      if (minCost > wons[i]){
        minCost = wons[i];
      }
      result += minCost * lengths[i];
    }

    System.out.println(result);
  }
}