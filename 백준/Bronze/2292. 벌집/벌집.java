import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count = 1;
        long i = 2;
        if(n==1){
            System.out.println(1);
            System.exit(0);
        }
        while(true){
            if( i <= n && n< i+ 6*count){
                System.out.println(count+1);
                break;
            }
            i = i + 6 * count;
            count+= 1;

        }
    }
}

