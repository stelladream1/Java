import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] p = new int[n+1];
        int [] d = new int[n+1];
        for(int i=1; i<=n;i++){
            p[i] = Integer.parseInt(st.nextToken());
            d[i] =  Integer.MAX_VALUE;
        }

        d[0] = 0;

        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                d[i] = Math.min(d[i], d[i-j] + p[j]);
            }
        }

        System.out.println(d[n]);



    }
}
