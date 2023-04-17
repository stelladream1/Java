import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int result = 1;

        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }

        }
        System.out.println(result);
    }
}

