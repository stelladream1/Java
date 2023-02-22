import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] prime = new int[1000001];
        int pn = 0;
        boolean[] check = new boolean[1000001];
        int n = 1000000;

        for (int i = 2; i <= n; i++) {
            if (!check[i]) {
                prime[pn++] = i;
                for (int j = i * 2; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                break;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (!check[i] && !check[number - i]) {
                    System.out.println(number + " = " + i + " + " + (number - i));
                    break;
                }
            }
        }
    }
}
