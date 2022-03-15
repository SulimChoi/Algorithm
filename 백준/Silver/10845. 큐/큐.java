import java.util.ArrayList;
import java.io.*;

public class Main<T>{
  private ArrayList<Integer> queue = new ArrayList<Integer>();

  public void push(Integer item){
    queue.add(item);
  }

  public Integer pop(){
    return queue.isEmpty() ? -1 : queue.remove(0);
  }

  public Integer size() {
    return queue.size();
  }

  public Integer empty() {
    return queue.isEmpty() ? 1 : 0;
  }

  public Integer front() {
    return queue.isEmpty() ? -1 : queue.get(0);
  }
  
  public Integer back(){
    return queue.isEmpty() ? -1 : queue.get(queue.size() - 1);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Main<Integer> queue = new Main<Integer>();

    Integer count = Integer.parseInt(br.readLine());
    for (Integer i = 0; i < count; i++){
      String str = br.readLine();

      switch(str) {
        case "pop":
          bw.write(queue.pop() + "\n");
          break;
        case "size":
          bw.write(queue.size() + "\n");
          break;
        case "empty":
          bw.write(queue.empty() + "\n");
          break;
        case "front":
          bw.write(queue.front() + "\n");
          break;
        case "back":
          bw.write(queue.back() + "\n");
          break;
        default:
          queue.push(Integer.parseInt(str.split(" ")[1] + ""));
          break;
      }
    }

    bw.flush();
    bw.close();
  }
}