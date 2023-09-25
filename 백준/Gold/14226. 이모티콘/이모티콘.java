import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int n ;
    static int [][] d;
    public static void bfs(){
        Queue<Integer> screen = new LinkedList<>();
        Queue<Integer> clip = new LinkedList<>();

        boolean [][] check = new boolean[1001][1001];

        screen.add(1);
        clip.add(0);
        check[1][0] = true;
        while(!screen.isEmpty()){
            int s = screen.remove();
            int c = clip.remove();

            if(s==n){
                break;
            }

            if(c+s <= 1000){
                if(!check[s][s]){
                    d[s][s] = d[s][c]  + 1;
                    check[s][s] = true;
                    screen.add(s);
                    clip.add(s);
                }
            }

            if(c+s <= 1000){
                if(!check[s+c][c]){
                    d[s+c][c] = d[s][c]  + 1;
                    check[s+c][c] = true;
                    screen.add(s+c);
                    clip.add(c);
                }
            }

            if(0<=s-1){
                if(!check[s-1][c]){
                    d[s-1][c] = d[s][c]  + 1;
                    check[s-1][c] = true;
                    screen.add(s-1);
                    clip.add(c);
                }
            }

        }

    }
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 수빈
        d = new int[1001][1001];
        bfs();
        int result = Integer.MAX_VALUE;
        for(int i=0; i<d[n].length; i++){
            if(d[n][i]!=0){
                result = Math.min(result, d[n][i]);
            }
        }
        System.out.println(result);
    }
}

