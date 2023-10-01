import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] a;
    static boolean[] visit;
    static int count;

    public static void dfs(int x) {

        if(visit[x]) return;
        visit[x] = true;
        count = count + 1;
        for(int y: a[x]){
            if(!visit[y]){
                dfs(y);
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        a = new ArrayList[n+1];
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken()) -1 ;
            int u = Integer.parseInt(st.nextToken()) -1;

            a[v].add(u);
            a[u].add(v);
        }


        visit = new boolean[n];
        count = -1;
        dfs(0);
        System.out.println(count);



    }
}

