import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int [] prime;
    public static void prime(int n){

        prime = new int[n+1];
        int pn = 0;

        boolean [] check = new boolean[n+1];

        for(int i =2; i<=n ;i++){
            if(!check[i]){
                prime[pn++] = i;
                for(int j = i*2; j<=n; j=j+i){
                    check[j] = true;
                }
            }
        }

    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        prime(n);

        for(int i =0; i<=n; i++){
           if(prime[i] >= s && prime[i]<= n){
               System.out.println(prime[i]);
           }
        }

    }
}

