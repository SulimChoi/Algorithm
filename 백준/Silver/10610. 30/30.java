import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder num = new StringBuilder(sc.nextLine());
        int sum = 0;
        
        for (int i=0; i < num.length(); i++){
            sum += num.charAt(i);
        }
        
        if (num.toString().contains("0") && (sum % 3 == 0)){
            char[] cArr = num.toString().toCharArray();
            Arrays.sort(cArr);
            num = new StringBuilder(new String(cArr)).reverse();
            System.out.println(num.toString());
        }
        else {
            System.out.println(-1);
        }
    }
}