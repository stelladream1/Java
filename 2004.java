import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static long factorial(long number, long number2){
        long count = 0;
        for(long i = number; i<=number2; i=i*number){
            count =  count + (number2 / i);
        }
        return count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=  new StringTokenizer(br.readLine(), " ");

        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        long result2 = factorial(2,n) - factorial(2,m) - factorial(2,n-m);
        long result5 = factorial(5,n) - factorial(5,m) - factorial(5,n-m);



        System.out.println(Math.min(result2,result5));
    }
}

