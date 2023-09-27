import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }

            char [] a = String.valueOf(n).toCharArray();
            boolean ok = true;
            for(int i =0; i<(a.length/2); i++){
                if(a[i] != a[a.length-i-1]) {
                    ok = false;
                }
            }
            if(ok){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

        }

    }
}

