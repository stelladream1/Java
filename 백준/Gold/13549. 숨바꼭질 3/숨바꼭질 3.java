import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int [] d;
    public static void bfs(int n, int k){

        Queue<Integer> q = new LinkedList<>();
        boolean [] check = new boolean[100001];

        q.add(n);
        check[n] = true;
        d[n] = 0;

        while(!q.isEmpty()){
            int x = q.remove();

            if(x==k){
                break;
            }

            if(x*2 <= 100000){
                if(!check[2*x]){
                    q.add(x*2);
                    check[2*x] = true;
                    d[2*x] = d[x];
                }
            }

            if(0<=x-1){
                if(!check[x-1]){
                    q.add(x-1);
                    check[x-1] = true;
                    d[x-1] = d[x] + 1;
                }
            }

            if(x+1<=100000){
                if(!check[x+1]){
                    q.add(x+1);
                    check[x+1] = true;
                    d[x+1] = d[x] + 1;
                }
            }
        }

    }


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        d = new int[100001];
        bfs(n,k);
        System.out.println(d[k]);
    }
}

