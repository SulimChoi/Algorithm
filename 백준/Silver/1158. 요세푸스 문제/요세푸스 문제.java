import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());
    Integer N = Integer.parseInt(st.nextToken());
    Integer K = Integer.parseInt(st.nextToken());
    Integer count = 1;
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for (Integer i = 0; i < N; i++){
      nums.add(i+1);
    }

    LinkedList<Integer> link = new LinkedList<Integer>(nums);
    while(link.size() > 1) {
      if(count % K == 0) {
        sb.append(link.poll() + ", ");
      }
      else {
        link.add(link.poll());
      }
      count += 1;
    }
    sb.append(link.poll());
    System.out.println("<" + sb + ">");
  }
}