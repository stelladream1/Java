import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] s = new int[n+1];
        int [] d = new int[n+1];
        for(int i =1; i<=n; i++){
            s[i] = Integer.parseInt(br.readLine());
        }
        d[1] = s[1];
        if(n>=2){
            d[2] = s[1] + s[2];
        }
        for(int i =3; i<=n; i++){
            d[i] = Math.max(d[i-2]+ s[i] , s[i-1] + d[i-3] +s[i]);
      
        }

        System.out.println(d[n]);
    }
}

