import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long [][] d = new long[n+1][2];
        d[1][0] = 0;
        d[1][1] = 1;


        for(int i =2; i<n+1; i++){
            for(int j = 0; j<2; j++){
                if(j==0){
                    d[i][j] = d[i-1][0] + d[i-1][1];
                }
                else{
                    d[i][j] = d[i-1][0];
                }
            }
        }
        System.out.println(d[n][0] + d[n][1]);



    }
}
