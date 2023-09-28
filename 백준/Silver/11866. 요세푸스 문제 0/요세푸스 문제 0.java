import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.print("<");
        Queue<Integer> q = new LinkedList<>();
        for(int i =1; i<=n;i++){
            q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()){
            count+=1;
            int a = q.remove();
            if(count == k){
                count = 0;
                System.out.print(a);
                if(q.size()!=0){
                    System.out.print(", ");
                }
            }
            else{
                q.add(a);
            }
        }


        System.out.println(">");

    }
}

