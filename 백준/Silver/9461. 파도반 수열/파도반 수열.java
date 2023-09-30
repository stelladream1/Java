import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        long [] d = new long[101];

        d[1] = 1;
        d[2] = 1;
        d[3] = 1;
        d[4] = 2;
        d[5] = 2;

        for(int i = 6; i<101; i++){
            d[i] = d[i-5] + d[i-1];
        }

        for(int i =0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(d[n]);

        }
    }
}

