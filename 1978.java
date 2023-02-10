import java.util.*;
import java.io.*;

public class Main {

    static boolean prime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (prime(number)) {
                result = result + 1;

            }


        }

        System.out.print(result);
    }

}