import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int count = 0;
    long add = 1;
    long sum = 0;
    long num = sc.nextLong();

    while (true){
      sum += add ++;
      count ++;

      if (sum > num) {
        count --;
        break;
      }
    }
    System.out.println(count);
  }
}