import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        long sum = 0;

        String st = sc.nextLine();
        int count = 0;
        for(char ch: st.toCharArray()){
  

            sum  = (long) (sum + (ch -'0' - 48) * Math.pow(31,count));
            count = count + 1;
        }
        System.out.println(sum);
    }
}

