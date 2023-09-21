
import java.sql.Array;
import java.util.*;

class Pair{
    int x;
    int y;
    Pair(int x, int y) {
        this.x= x;
        this.y= y;
    }
}
public class Main {

    static int [][] graph;
    static int [][] visited;
    static int n;

    static int [] dx = {-1, 1, -2, 2, -2, 2, -1,1 };
    static int [] dy = {2, 2 ,1, 1, -1, -1, -2, -2};


    public static void bfs(int x, int y){
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(x,y));
        visited[x][y] = 1;

        while(!q.isEmpty()){
            Pair p = q.remove();
            x = p.x;
            y = p.y;


            for(int i =0; i<8 ;i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if(0<= nx && nx <n && 0<=ny && ny <n){
                    if(visited[nx][ny]==0){
                        q.add(new Pair(nx,ny));
                        visited[nx][ny] = visited[x][y] + 1;
                    }
                }
            }
        }
    }

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k =0; k< t; k++){

            n = sc.nextInt();
            graph = new int[n][n];
            visited = new int[n][n];

            int start_x = sc.nextInt(); //출발지 x
            int start_y = sc.nextInt(); //출발지 y
            int end_x = sc.nextInt(); //목적지 x
            int end_y = sc.nextInt(); //목적지 y

            bfs(start_x, start_y);

//            for(int i =0; i<n; i++){
//                for(int j =0; j<n; j++){
//                    System.out.print(visited[i][j] + " ");
//                }
//                System.out.println();
//            }
//
            System.out.println(visited[end_x][end_y] - 1);


        }


    }
}