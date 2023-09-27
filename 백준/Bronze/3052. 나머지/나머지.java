import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[42];

        for(int i =0; i<10;i++){
            int k = sc.nextInt();
            a[k % 42] = a[k% 42] + 1;
        }
        int result = 0;
        for(int i =0; i<42;i++){
            if(a[i]!=0){
                result = result + 1;
            }
        }
        System.out.println(result);

    }
}

