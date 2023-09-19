
import java.sql.Array;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] a;
    static boolean[] c;

    public static void dfs(int x) {
        if (c[x]) return;

        c[x] = true;

        for (int y : a[x]) {
            if (c[y] == false) {
                dfs(y);
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점의 개수
        int m = sc.nextInt(); //노드의 개수
        c = new boolean[n + 1];
        a = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            a[u].add(v);
            a[v].add(u);
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (c[i] == false) {
                dfs(i);
                ++count;
            }

        }


        System.out.println(count);

    }
}