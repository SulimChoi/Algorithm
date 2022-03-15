import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int min = 0;
    int max = 0;

    StringTokenizer st = new StringTokenizer(sc.nextLine());
    
    String num1 = new String(st.nextToken());
    String num2 = new String(st.nextToken());

    min = min(num1, num2);
    max = max(num1, num2);

    System.out.printf("%d %d%n", min, max);

  }

  public static int min(String num1, String num2){
    int result = 0;

    if(num1.contains("6")){
      num1 = num1.replace("6", "5");
    }

    if(num2.contains("6")){
      num2 = num2.replace("6", "5");
    }

    result = Integer.parseInt(num1) + Integer.parseInt(num2);

    return result;
  }

  public static int max(String num1, String num2){
    int result = 0;

    if(num1.contains("5")){
      num1 = num1.replace("5", "6");
    }

    if(num2.contains("5")){
      num2 = num2.replace("5", "6");
    }

    result = Integer.parseInt(num1) + Integer.parseInt(num2);

    return result;
  }
}