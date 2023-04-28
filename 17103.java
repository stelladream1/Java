import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        boolean check[] = new boolean[1000001];
        int n = 1000000;
        for (int i = 2; i <= n; i++) {
            if (!check[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int s = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= s / 2; j++) {
                if (!check[j] && !check[s - j]) {
                    count = count + 1;
                }
            }
            System.out.println(count);
        }
    }
}
