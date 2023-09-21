
import java.sql.Array;
import java.util.*;

class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int m;
    static int n;
    static int [][] graph;
    static int [][] visited;
    static Queue<Pair> q;
    static int [] dx = {0,0,-1,1};
    static int [] dy = {1,-1,0,0};

    public static void bfs(int x, int y){

        while(!q.isEmpty()){
            Pair p = q.remove();
            x = p.x;
            y = p.y;

            for(int i =0 ; i<4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if(0<= nx && nx < n && 0<=ny && ny <m){
                    if(visited[nx][ny]==0 && graph[nx][ny]==0){
                        q.add(new Pair(nx,ny));
                        visited[nx][ny] = visited[x][y] + 1;

                    }
                }
            }
        }

    }
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); // 세로
        n = sc.nextInt(); // 가로
        graph = new int[n][m];
        visited = new int [n][m];
        q = new LinkedList<Pair>();
        sc.nextLine();
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                graph[i][j] = sc.nextInt();
                if(graph[i][j]==1){
                    q.add(new Pair(i,j));
                    visited[i][j] = 1;
                }
            }
        }

        bfs(0,0);
        int result = -1;
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(visited[i][j]!=0 && graph[i][j]!=-1){
                    result = Math.max(result, visited[i][j]);
                }
                if(visited[i][j]==0 && graph[i][j]==0){
                    System.out.println(-1);
                    System.exit(0);
                }
            }


        }
        System.out.println(result-1);


    }
}