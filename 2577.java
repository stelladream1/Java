import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int [] count = new int[10];
        String result = String.valueOf(a*b*c);
        for(int i =0; i<result.length(); i++){

            int num = Integer.parseInt( result.substring(i,i+1));
            count[num]++;

        }

        for(int cnt:count){
            System.out.println(cnt);
        }

    }
}

