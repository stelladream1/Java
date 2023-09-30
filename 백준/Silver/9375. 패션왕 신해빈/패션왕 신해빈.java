import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int k  = 0; k<t; k++) {
            Hashtable<String, Integer> hash = new Hashtable<>();
            int n = Integer.parseInt(br.readLine());


            for (int i = 0; i < n; i++) {
                String[] s = br.readLine().split(" ");
                if (hash.containsKey(s[1])) {
                    int count = hash.get(s[1]);
                    hash.put(s[1], count + 1);
                } else {
                    hash.put(s[1], 1);
                }
            }
            int sum = 1;

            for (int count : hash.values()) {
                sum = sum * (count + 1);
            }
            System.out.println(sum - 1);
        }

    }
}

