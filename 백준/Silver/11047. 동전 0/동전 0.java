import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] array = new int[n];
        sc.nextLine();
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }

        long sum  = 0;
        int count = 0;


        for(int i =n-1; i>=0; i--){
            count = count + ( k / array[i]);
            k = k % array[i];

            if(k==0){
                break;
            }

        }
        System.out.println(count);

    }
}


