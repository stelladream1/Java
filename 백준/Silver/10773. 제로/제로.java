import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<n; i++){

            int t = Integer.parseInt(br.readLine());
            if(t!=0){
                s.push(t);
            }
            else{
                s.pop();
            }
        }
        long sum = 0;
        for(int i =0; i< s.size(); i++){
            sum = sum + s.get(i);
        }
        System.out.println(sum);

    }
}

