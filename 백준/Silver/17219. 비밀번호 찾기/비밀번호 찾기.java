import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Hashtable<String, String> hash = new Hashtable<>();

        for(int i =0 ;i<n; i++){
            String [] s = br.readLine().split(" ");
            hash.put(s[0], s[1]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m; i++){
            String s = br.readLine();
            sb.append(hash.get(s)).append("\n");
        }

        System.out.println(sb);
    }
}

