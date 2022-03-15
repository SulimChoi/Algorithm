import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = 1000 - sc.nextInt();
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10, 5};
        
        for(int i=0;i<coinTypes.length;i++){
            int coin = coinTypes[i];
            count += num / coin;
            num %= coin;
        }
        
        if(num != 0){
            count += num;
        }
        
        System.out.println(count);
    }
}