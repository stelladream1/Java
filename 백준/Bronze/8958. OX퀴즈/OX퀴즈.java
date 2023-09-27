import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String sent = sc.next();
            int sum = 0;
            int count = 0;
            char[] c = sent.toCharArray();

            for(int k = 0; k<c.length; k++){
                if(c[k]=='O'){
                    count = count + 1;
                    sum = sum + count;
                }
                else{
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}

