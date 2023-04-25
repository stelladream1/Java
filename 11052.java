import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int [] p = new int[s+1];
        int [] d = new int[s+1];
        p[0] = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =1; i<=s;i++){
            p[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =1; i<=s; i++){
            for(int j =1; j<=i; j++){
                d[i] = Math.max(d[i], d[i-j]+ p[j]);

            }
        }

        System.out.println(d[s]);




    }
}
