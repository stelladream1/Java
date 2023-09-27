import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int [] a;
    static int [] m;
    static int binary(int start, int end, int num){
        while(start <= end){
            int mid = (start + end) / 2;

            if (a[mid] == num){
                return 1;
            }
            else if(a[mid]> num){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return 0;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = new int[n];

        for(int i =0; i<n; i++){
           a[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        m = new int[k];
        for(int i =0; i<k; i++){
            m[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0; i<k ;i++){

            bw.write(binary(0,n-1, m[i]) + "\n");
        }
        bw.flush();


    }
}

