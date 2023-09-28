import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int k2 = k;
        int mul1 = 1;
        for(int i =0; i<k; i++){
            mul1 = mul1 * n--;
        }
        int mul2 = 1;
        for(int i =0; i<k; i++){
            mul2 = mul2 * k2--;
        }

        System.out.println(mul1/ mul2);

    }
}

