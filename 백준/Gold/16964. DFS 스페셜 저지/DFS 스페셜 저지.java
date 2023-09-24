import java.lang.reflect.Array;
import java.util.*;
public class Main {

    static ArrayList<Integer>[] a;
    static ArrayList<Integer> answer;

    public static void dfs(int x, boolean [] check){
        if(check[x]) return;
        answer.add(x);
        check[x] = true;
        for(int y: a[x]){
            if(!check[y]){
                dfs(y,check);
            }
        }
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean [] check = new boolean[n];
        a = new ArrayList[n];
        int [] b = new int[n];
        int [] order = new int[n];

        for(int i =0; i<n;i++){
            a[i] = new ArrayList<>();
        }
        for(int i =0; i<n-1; i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt() -1;
            a[u].add(v);
            a[v].add(u);
        }

        for(int i =0; i<n;i++){
            b[i] = sc.nextInt() -1;
            order[ b[i] ] = i;
        }
        answer = new ArrayList<>();

        for(int i =0; i<n;i++){
            Collections.sort(a[i], new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return order[o1]- order[o2];
                }
            });
        }

        dfs(0,check);


        for(int i =0; i<n; i++){
            if(answer.get(i)!= b[i]){
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}

