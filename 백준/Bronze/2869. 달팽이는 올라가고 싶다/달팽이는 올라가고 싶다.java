import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int result = (v-a) / (a-b);
        if ( (v-a) % (a-b) !=0 ){
            result = result + 1;
        }
        System.out.println(result+1);
    }
}

