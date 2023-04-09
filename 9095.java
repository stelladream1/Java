import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int [] d = new int[11];

        d[0] = 1;
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for(int i =4;i<=10; i++){
                d[i] = d[i-1] + d[i-2] + d[i-3];
            }

        for(int i = 0; i<s;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(d[n]);
        }



    }
}
