import java.io.*;
import java.util.*;

public class Main {

    static int gcd(int a, int b){
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;

        }
        return a;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i =0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            int GCD = gcd(a,b);
            int LCM = ( a*b) / GCD;
            System.out.println(LCM);
        }


    }


}

