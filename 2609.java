import java.io.*;
import java.util.*;

public class Main {

    static int gcd(int n, int m){
        while(m!=0){
            int r = n%m;
            n = m;
            m = r;
        }
        return n;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        int GCD = gcd(a,b);
        int LCM = ( a*b) / GCD;

        System.out.println(GCD);
        System.out.println(LCM);
    }


}

