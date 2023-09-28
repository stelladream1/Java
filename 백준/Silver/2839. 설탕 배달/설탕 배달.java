import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] d = new int[n+1];

        for(int i =1; i<=n; i++){
            d[i] = Integer.MAX_VALUE;

            if(i % 3 == 0){
                d[i] = i /3;
            }
            if(i % 5 == 0){
                d[i] = i /5;
            }
        }


        for(int i =3; i<=n ; i++){
            for(int j = 1; j<i/2 ; j++){
                if(d[j]!= Integer.MAX_VALUE && d[i-j]!=Integer.MAX_VALUE){
                    d[i] = Math.min(d[i], d[j]+ d[i-j]);
                }
            }
        }


        if(d[n] == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(d[n]);
        }

    }
}

