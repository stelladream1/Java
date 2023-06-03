import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] array = new int[n];
        int [] answer = new int[n];

        String[] str = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=1; i<n; i++){

            while(!stack.isEmpty()){
                if(array[stack.peek()] < array[i]){
                    answer[stack.pop()] = array[i];
                }else{
                    break;
                }
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n; i++){
            sb.append(answer[i] +" ");
        }

        System.out.print(sb);
    }

}