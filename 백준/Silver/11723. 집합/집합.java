import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = 20;
        int s = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<t;i++) {
            String[] str = br.readLine().split(" ");

            if(str[0].equals("add")){
                s = (s | (1 <<  Integer.parseInt(str[1]) -1 ));
            }

            else if(str[0].equals("check")){
                if((s & (1 << Integer.parseInt(str[1]) -1)) == 0 ){
                    sb.append("0\n");
                            
                }else{
                    sb.append("1\n");
                }
            }

            else if(str[0].equals("remove")){
                s = (s & ~(1 << Integer.parseInt(str[1]) -1));
            }

            else if(str[0].equals("toggle")){
                s = (s ^ (1 << Integer.parseInt(str[1]) -1));
            }

            else if(str[0].equals("all")){
                s = (1 << n) -1;
            }

            else if(str[0].equals("empty")){
                s = 0;
            }

        }
        System.out.print(sb);
    }
}