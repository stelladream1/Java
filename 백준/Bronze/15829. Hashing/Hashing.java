import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        long sum = 0;

        String st = sc.nextLine();
        long pow = 1; // 거듭제곱을 저장할 변수

        for (int i = 0; i < st.length(); i++) {
            int ch = st.charAt(i) - 'a' + 1; // 문자의 가중치 계산

            // 처음 문자는 그대로 더하고, 이후 문자는 거듭제곱을 곱한 후 더합니다.
            sum = (sum + (ch * pow) % 1234567891) % 1234567891;

            // 다음 문자를 위해 거듭제곱을 갱신합니다.
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(sum);
    }
}
