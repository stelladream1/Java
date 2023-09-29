import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int [] array = new int[t];
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            array[i] = n;
        }
        Arrays.sort(array);

        for(int i =0; i<t; i++){
            sb.append(array[i]);
            sb.append("\n");
        }
        System.out.println(sb);

    }
}

