import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int lenN = Integer.parseInt(br.readLine());
    int[] N = new int[lenN];
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i=0; i<lenN; i++){
      N[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(N);

    int lenM = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    
    StringBuilder sb = new StringBuilder();

    for (int i=0; i<lenM; i++){
      if(Arrays.binarySearch(N, Integer.parseInt(st.nextToken())) >= 0){
        sb.append(1).append('\n');
      }
      else{
        sb.append(0).append('\n');
      }
    }
    System.out.println(sb);
  }
}