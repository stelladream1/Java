import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] a = new int[n];
        int [] d = new int[n];
        for(int i =0; i< n;i++){
            a[i] = Integer.parseInt(st.nextToken());
            d[i] = 1;

        }


        for(int i =1; i<n;i ++){
            d[i] = 1;

            for(int j = i-1; j>=0; j--){
                if(a[i] > a[j]){
                    d[i] = Math.max(d[i], d[j] + 1);

                }

            }
        }

        System.out.println(Arrays.stream(d).max().getAsInt());


    }
}
