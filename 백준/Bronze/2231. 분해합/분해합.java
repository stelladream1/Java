import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] d = new int[2000001];

        for (int i = 1; i < 1000000; i++) {
            int sum = i;

            for(char ch: String.valueOf(i).toCharArray()){
                sum = sum + Integer.parseInt(String.valueOf(ch));

            }
            if (d[sum] == 0 || d[sum] > i) {
                d[sum] = i;
            }
        }
        System.out.println(d[n]);
    }
}

