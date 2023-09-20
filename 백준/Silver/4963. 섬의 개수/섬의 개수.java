
import java.sql.Array;
import java.util.*;


public class Main {


    static int[][] graph;
    static boolean[][] check;
    static int[] nx = {0, 0, -1 ,1, -1, 1, -1, 1};
    static int[] ny = {-1, 1, 0, 0, 1, 1, -1, -1};

    static int w;
    static int h;

    public static void dfs(int x,int y){

        if(check[x][y]) return;

        check[x][y] = true;

        for(int i=0; i<8; i++){
            int dx = nx[i] + x;
            int dy = ny[i] + y;
            if(0<=dx && dx<h && 0<=dy && dy<w ){
                if(graph[dx][dy]==1 && !check[dx][dy]){
                    dfs(dx,dy);
                }
            }
        }


    }
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);


        while(true){
            w = sc.nextInt();
            h = sc.nextInt();

            if(w==0 && h==0){
                break;
            }
            graph = new int[h][w];
            check = new boolean[h][w];
            for(int i=0; i <h; i++){
                for(int j =0; j<w; j++){
                    graph[i][j]= sc.nextInt();
                }
            }

            int count = 0;
            for(int i=0; i <h; i++){
                for(int j =0; j<w; j++){
                    if(!check[i][j] && graph[i][j]==1){
                        dfs(i,j);
                        ++count;
                    }
                }
            }
            System.out.println(count);


        }

    }
}