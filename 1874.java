import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        int start = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        boolean flag = true;
        for (int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(br.readLine());
            if (start < num) {
                for (int j = start + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                start = num;
                stack.pop();
                sb.append("-\n");
            }
            else if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            }
            else if((start > num) && (stack.peek()!= num) ){
                flag = false;
            }

        }

        if(flag){
            System.out.println(sb);
        }
        else{
            System.out.print("NO");
        }
    }
}
