
import java.sql.Array;
import java.util.*;

class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x =x ;
        this.y = y;
    }
}

public class Main {

    static public int n;
    static public int m;
    static int [][] graph;
    static int [][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void bfs(int x, int y){

        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(x,y));
        visited[x][y] = 1;

        while(!q.isEmpty()){
            Pair p = q.remove();
            x = p.x;
            y = p.y;

            for(int i =0; i<4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if(0<=nx && nx<n && 0<=ny && ny < m ){
                    if(visited[nx][ny] == 0 && graph[nx][ny]==1){
                        q.add(new Pair(nx,ny));
                        visited[nx][ny]= visited[x][y] + 1;
                    }
                }
            }

        }
    }


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();
        graph = new int[n][m];
        visited = new int[n][m];

        for(int i =0; i<n; i++){
            String line = sc.nextLine();
            for(int j =0; j<m; j++ ){
                graph[i][j] = line.charAt(j) - '0';
            }
        }
        int count = 0;
        bfs(0,0);

//        for(int i =0; i<n; i++){
//
//            for(int j =0; j<m; j++ ){
//                System.out.print(visited[i][j] + " ");
//            }
//            System.out.println();
//        }

        System.out.println(visited[n-1][m-1]);



    }
}