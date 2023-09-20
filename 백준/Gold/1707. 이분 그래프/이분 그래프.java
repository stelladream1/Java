
import java.sql.Array;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] a;
    static int[] c;

    public static void dfs(int x, int include ){

        c[x]=include;
        for(int y: a[x]){
            if(c[y]== 0){
                dfs(y, 3-include);
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i =0; i < t; i++){
            int n = sc.nextInt(); //정점의 개수
            int m = sc.nextInt(); //간선의 개수
            c = new int[n+1];
            a = new ArrayList[n+1];

            for(int k = 1; k<=n; k++){
                a[k] = new ArrayList<>();
            }
            for(int j = 0;j<m; j++ ){
                int u = sc.nextInt();
                int v = sc.nextInt();

                a[u].add(v);
                a[v].add(u);
            }

            for(int k=1; k<=n;k++){
                if(c[k]==0){
                    dfs(k,1);
                }
            }

            String answer ="YES";
            for(int k = 1; k<=n; k++){

                for(int y:a[k]){
                    if(c[k]==c[y]){
                        answer = "NO";
                    }
                }
            }
            System.out.println(answer);

        }




    }
}