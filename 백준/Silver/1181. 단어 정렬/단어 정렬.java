import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String [] s = new String[n];

        for(int i =0; i<n; i++){

           s[i] = (sc.nextLine());

        }
        HashSet<String> hs = new HashSet<>(Arrays.asList(s));
        s = hs.toArray(new String[0]);
        Arrays.sort(s);
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for(int i =0; i<s.length; i++){
            System.out.println(s[i]);

        }
    }
}

