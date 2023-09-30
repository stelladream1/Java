import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        int [] array = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i =1; i<=n; i++){
            int num = Integer.parseInt(st.nextToken());
            array[i] = array[i-1] + num;
        }

        for(int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(array[end] - array[start-1]);
        }

    }
}

