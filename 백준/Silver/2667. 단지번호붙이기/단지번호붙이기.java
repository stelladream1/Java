
import java.sql.Array;
import java.util.*;


public class Main {

    static int[][] graph;
    static boolean[][] check;
    static int[] nx = {0, 0, 1, -1};
    static int[] ny = {1, -1, 0, 0};

    static int n;


    public static int dfs(int i, int j, int count) {

        if (check[i][j] || graph[i][j] == 0) return count;

        check[i][j] = true;
        ++count;
        for(int k=0; k<4; k++){


            int dx = i +  nx[k];
            int dy = j + ny[k];

            if(0<=dx && dx< n &&  0<=dy && dy< n){
                if(check[dx][dy]==false && graph[dx][dy]==1){
                    count = dfs(dx, dy, count);

                }
            }
        }

        return count;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        graph = new int[n][n];
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {

                graph[i][j] = line.charAt(j) -'0';
            }

        }
        check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(check[i][j]==false && graph[i][j] !=0){
                    answer.add(dfs(i, j, 0));
                }
            }
        }
        Collections.sort(answer);

        System.out.println(answer.size()); // 아파트 단지의 개수 출력

        for (int size : answer) {
            System.out.println(size); // 각 아파트 단지 내 아파트의 수 출력
        }
    }
}