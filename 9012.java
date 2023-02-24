import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            boolean isValid = true; // 유효한 괄호열인지 표시하는 변수

            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isValid = false; // 괄호열이 유효하지 않음
                        break; // 반복문 종료
                    }
                }
            }

            if (!stack.isEmpty() || !isValid) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
