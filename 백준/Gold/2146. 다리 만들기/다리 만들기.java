import java.lang.reflect.Array;
import java.util.*;
class Pair {
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {



    static int [][] graph;
    static boolean [][] visited;
    static int[][] c;
    static int [][] d;
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    static int n;
    static Queue<Pair> q;
    static void dfs(int x, int y, int count){
        if(visited[x][y]) return;

        visited[x][y] = true;
        c[x][y] = count;

        for(int i =0; i<4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(0<=nx && nx < n && 0<=ny && ny < n){
                if(!visited[nx][ny] && graph[nx][ny]==1){
                    dfs(nx,ny,count);
                }
            }
        }
    }



    static void bfs(){

        while(!q.isEmpty()){
            Pair p  = q.remove();
            int x = p.x;
            int y = p.y;
            for(int i =0; i< 4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if(0<=nx && nx < n && 0<=ny && ny < n){
                    if(d[nx][ny]==-1){
                        c[nx][ny]= c[x][y];
                        d[nx][ny] = d[x][y] + 1;
                        q.add(new Pair(nx,ny));
                    }
                }
            }

        }

    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new int[n][n];
        visited = new boolean[n][n];
        c = new int[n][n];
        d = new int [n][n];
        for(int i =0; i<n;i++){
            for(int j =0; j<n; j++){
                graph[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n;j++){
                if(!visited[i][j] && graph[i][j]==1){
                    dfs(i,j,++count);
                }
            }
        }

        q = new LinkedList<Pair>();
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                d[i][j] = -1;
                if(graph[i][j]==1){
                    q.add(new Pair(i,j));
                    d[i][j] = 0;
                }
            }
        }


        bfs();
//        for(int i =0; i<n;i++){
//            for(int j =0; j<n; j++){
//                System.out.print(d[i][j] + " ");
//            }
//            System.out.println();
//        }

        int answer = Integer.MAX_VALUE;

        for(int i =0; i<n; i++){
            for(int j =0; j<n ; j++){
                for(int k =0; k<4; k++){
                    int x = dx[k] + i;
                    int y = dy[k] + j;

                    if(0<=x && x < n && 0<=y && y < n){
                        if(c[i][j] != c[x][y]){
                            answer = Math.min(answer, d[i][j] + d[x][y]);
                        }
                    }
                }
            }
        }
        System.out.println(answer);

    }
}

