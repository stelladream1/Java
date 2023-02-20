import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] nums = br.readLine().split(" ");
        StringBuffer sb1 = new StringBuffer(nums[0]);
        StringBuffer sb2 = new StringBuffer(nums[1]);
        String reverse1 = sb1.reverse().toString();
        String reverse2 = sb2.reverse().toString();

        int a = Integer.parseInt(reverse1);
        int b = Integer.parseInt(reverse2);

        System.out.println(Math.max(a,b));
        

    }
}

