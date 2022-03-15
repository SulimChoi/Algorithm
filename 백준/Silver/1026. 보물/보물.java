import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int result = 0;
    String space = sc.nextLine();

    StringTokenizer st1 = new StringTokenizer(sc.nextLine());
    for(int i=0; i < N; i++){
      A[i] = Integer.parseInt(st1.nextToken());
    }

    StringTokenizer st2 = new StringTokenizer(sc.nextLine());
    for (int i=0; i < N; i++){
      B[i] = Integer.parseInt(st2.nextToken());
    }


    Arrays.sort(A);

    int[] BCopy = Arrays.copyOf(B, N);

    for(int i=0; i < N; i++) {
      int B_max = max(BCopy);
      result += A[i] * B_max;
    }

    System.out.println(result);

  }
  
  public static int max(int[] arr){
    int index = -1;
    int max = -1;

    for(int i=0; i < arr.length; i++){
      if (max < arr[i]){
        max = arr[i];
        index = i;
      }
    }
    
    arr[index] = 0;

    return max;
  }
}