import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Stack<Character> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine() + "\n";
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(char ch: str.toCharArray()){

            if(flag){
                if (ch ==' ' || ch =='\n'){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(ch);
                }

                else if(ch =='<'){
                    flag = false;
                    if(!stack.isEmpty()){
                        while(!stack.isEmpty()){
                            sb.append(stack.pop());
                        }
                    }

                    sb.append(ch);

                }

                else{
                    stack.push(ch);
                }
            }


            else{

                if(ch=='>'){
                    flag=true;
                    if(!stack.isEmpty()){
                        while(!stack.isEmpty()){
                            sb.append(stack.pop());
                        }
                    }
                    sb.append(ch);
                }

                else{
                    sb.append(ch);
                }

            }





        }

        System.out.print(sb);

    }
}
