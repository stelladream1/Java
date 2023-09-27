import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int [] a = new int[26];

        for(int i =0; i<26;i++){
            a[i] = -1;
        }

        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(a[ch -97] == -1){
                a[ch -97] = i;
            }
        }
        for(int i =0; i<26;i++){
            System.out.print(a[i]+ " ");
        }


    }
}

