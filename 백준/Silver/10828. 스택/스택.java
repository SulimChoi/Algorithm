import java.io.*;
import java.util.Stack;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Integer> stack = new Stack<Integer>();
    
    Integer count = Integer.parseInt(br.readLine());
    for(Integer i = 0; i < count; i++){
      String str = br.readLine();
      
      switch (str){
        case "pop":
          try {
            bw.write(stack.pop() + "\n");
          }
          catch(Exception e){
            bw.write(-1 + "\n");
          }
          break;
        case "size":
          bw.write(stack.size() + "\n");
          break;
        case "empty":
          if(stack.empty()){
            bw.write(1 + "\n");
          }
          else {
            bw.write(0 + "\n");
          }
          break;
        case "top":
          try {
            bw.write(stack.peek() + "\n");
          }
          catch(Exception e){
            bw.write(-1 + "\n");
          }
          break;
        default:
          stack.push(Integer.parseInt(str.split(" ")[1]));
          break;
      }
    }
    bw.flush();
    bw.close();
  }
}