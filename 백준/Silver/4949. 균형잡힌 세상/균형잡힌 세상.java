import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = br.readLine();
            if(s.equals(".")){
                break;
            }
            boolean flag = true;

            Stack<Character> q = new Stack<>();

            for(int i =0; i<s.length();i++){
                char ch = s.charAt(i);


                if(ch== '('  || ch== '['){
                    q.add(ch);
                }

                else if(ch == ')' || ch==']'){
                    if(q.isEmpty()){
                        flag=false;
                        break;
                    }

                    char t = q.pop();
                    if(ch==')'){
                        if(t=='('){
                            continue;
                        }
                        else{
                            flag=false;
                            break;
                        }
                    }

                    if(ch==']'){
                        if(t=='['){
                            continue;
                        }
                        else{
                            flag=false;
                            break;
                        }
                    }
                }

            }
            if(!q.isEmpty()){
                System.out.println("no");
            }
            else{
                if(flag){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }

        }

    }
}

