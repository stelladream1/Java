import java.io.*;
import java.util.*;


class Pair{
    int x;
    int y ;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {


    static int [][] a;
    static boolean [][] check;
    static int [][] dist;
    static Queue<Pair> q = new LinkedList<Pair>();

    static int n ;
    static int m;
    static void bfs(){
        int [] dx = {0,0,-1,1};
        int [] dy = {-1,1,0,0};
        while(!q.isEmpty()){

            Pair p = q.remove();
            int x = p.x;
            int y = p.y;

            for(int i =0; i<4;i++){
                int nx = dx[i] + x;
                int ny =  dy[i] + y;

                if(0<= nx && nx<n && 0<=ny && ny<m){
                    if(a[nx][ny]==1 && !check[nx][ny]){
                        q.add(new Pair(nx,ny));
                        check[nx][ny] = true;
                        dist[nx][ny]  = dist[x][y] + 1;
                    }

                }
            }
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n][m];
        check = new boolean[n][m];
        dist = new int[n][m];

        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m;j++){
                a[i][j] =Integer.parseInt(st.nextToken());
                if(a[i][j]==2){
                    q.add(new Pair(i,j));
                    check[i][j] = true;
                    dist[i][j] = 0;
                }
            }
        }

        bfs();

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(a[i][j]==1 && !check[i][j]){
                    dist[i][j] = -1;
                }
            }

        }
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(dist[i][j] +" " );
            }
            System.out.println();
        }

    }
}


