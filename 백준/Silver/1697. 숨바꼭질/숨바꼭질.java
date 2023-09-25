import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int n ;
    static int k;
    public static int bfs(int x){

        boolean [] visited = new boolean[100001];
        int [] dist = new int[100001];

        visited[x] = true;
        dist[x] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        while(!q.isEmpty()){
            int move = q.remove();
            if(move == k){
                return dist[move];
            }
                
            if(0<=move-1 && move-1 <=100000){
                if(!visited[move-1]){
                    dist[move-1] = dist[move] + 1;
                    visited[move-1] = true;
                    q.add(move-1);
                }
            }
            if(0<=move+1 && move+1 <=100000) {
                if(!visited[move+1]){
                    dist[move+1] = dist[move] + 1;
                    visited[move+1] = true;
                    q.add(move+1);
                }
            }
            if(0<=move*2 && move*2 <=100000) {
                if (!visited[move * 2]) {
                    dist[move * 2] = dist[move] + 1;
                    visited[move * 2] = true;
                    q.add(move * 2);
                }

            }
        }
        return 0;
    }

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 수빈
        k = sc.nextInt(); // 동생

        int answer = bfs(n);
        System.out.println(answer);

    }
}

