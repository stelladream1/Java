import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int number = 0;
        for(int i =1; i<=9; i++){
            int n = sc.nextInt();
            if( answer < n){
                answer = n;
                number = i;
            }
        }
        System.out.println(answer);
        System.out.println(number);

    }
}

