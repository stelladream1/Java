import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] a;
    static boolean[] visit;
    static int count;

    public static void dfs(int x) {

        if (visit[x]) return;
        visit[x] = true;
        count = count + 1;
        for (int y : a[x]) {
            if (!visit[y]) {
                dfs(y);
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] d = new long[1001];

        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= n; i++) {
            if(i % 2 ==0){
                d[i] = ((d[i - 2] * 2 % 10007) + d[i-1]) % 10007;
            }
            else{
                d[i] =  d[i - 1] * 2 % 10007 - 1;
            }

        }

        System.out.println(d[n]);
    }
}


