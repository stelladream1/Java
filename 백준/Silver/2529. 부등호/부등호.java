import java.util.*;

public class Main {
    static int n;

    static boolean[] check = new boolean[10];
    static char[] a = new char[20];
    static ArrayList<String> answer = new ArrayList<>();


    static boolean compare(char x, char y, char inequal) {
        if (inequal == '<') {
            if (y > x) {
                return false;
            }
        }
        if (inequal == '>') {
            if (y < x) {
                return false;
            }
        }
        return true;
    }

    static void go(int index, String result) {

        if (index == n + 1) {
            answer.add(result);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (check[i]) continue;


            if (index == 0 || compare((char) (i + '0'), result.charAt(index - 1), a[index - 1])) {
                check[i] = true;
                go(index+1, result + i);
                check[i] = false;

            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray()[0];

        }

        go(0, "");
        Collections.sort(answer);
        System.out.println(answer.get(answer.size() - 1));
        System.out.println(answer.get(0));

    }
}