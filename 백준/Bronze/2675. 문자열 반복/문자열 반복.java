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
        for(int i =0; i<t; i++){
            int n = sc.nextInt();
            String sr = sc.next();

            for(char ch: sr.toCharArray()){
                for(int k = 0; k<n; k++){
                    System.out.print(ch);
                }
            }
            System.out.println();
        }



    }
}

