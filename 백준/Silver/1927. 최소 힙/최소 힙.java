import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int t = sc.nextInt();
        for(int i =0; i<t; i++){
            int n = sc.nextInt();
            if(n!=0){
                queue.add(n);
            }
            else{
                if(queue.isEmpty()){
                    sb.append("0").append("\n");
                }
                else{
                    sb.append(queue.peek()).append("\n");
                    queue.remove(queue.peek());
                }
            }
        }
        System.out.println(sb);



    }
}

