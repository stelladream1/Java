import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static int maxMoney = Integer.MIN_VALUE;
    public static int go(int index, int money, int n, int [] t, int [] p){

        if(index == n){
            maxMoney = Math.max(maxMoney, money);
            return   maxMoney;
        }
        if(index > n){
            return 0;
        }

        go(index+ t[index], money +p[index], n,t,p);
        go(index+1, money, n,t,p);

        return maxMoney;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] t = new int[n];
        int [] p = new int[n];
        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tt = Integer.parseInt(st.nextToken());
            int pp = Integer.parseInt(st.nextToken());

            t[i] = tt;
            p[i] =pp;
        }

       int result = go(0,0,n,t,p);
        System.out.println(result);
    }
}