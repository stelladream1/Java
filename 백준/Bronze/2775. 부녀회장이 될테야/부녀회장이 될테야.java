import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i =0; i<t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            int [] a = new int[n];
            for(int j = 0; j <n; j++){
                a[j] = j+1;
            }

            int start = 0;
            while (start < k) {
                a[0] = 1;
                for (int j = 1; j < n; j++) {
                    a[j] = a[j] + a[j-1];
                }

                start+=1;
            }

            System.out.println(a[n-1]);
        }

    }
}

