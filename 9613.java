import java.io.*;
import java.util.*;

public class Main {


    static long gcd(int a, int b){
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for(int i =0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int [] array = new int[n];

            for(int j = 0; j <n; j++ ){
                array[j] = Integer.parseInt(st.nextToken());
            }
            long sum = 0;

            for(int j = 0; j < n-1; j++){
                for( int k= j+1; k<n; k++){

                    sum = sum + gcd(array[j], array[k]);
                }

            }
            System.out.println(sum);
        }



    }



}


