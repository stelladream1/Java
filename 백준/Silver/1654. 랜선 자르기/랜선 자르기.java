import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int [] s = new int[k];
        int small = 0;
        for(int i =0; i<k;i++){
            s[i] = sc.nextInt();
            small  = Math.max(small, s[i]);
        }
        long start = 1;
        long end = small;

        long count = 0;

        Long line = 0L;
        while(start <= end){
            long mid = (start + end) / 2;
            count = 0;
            for(int i =0; i<k;i++){
                count = count + (s[i] / mid);
            }

            if (count >= n){
                line = Math.max(line, mid);
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        System.out.println(line);
    }
}

