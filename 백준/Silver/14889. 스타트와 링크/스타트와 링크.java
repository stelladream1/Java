import java.util.*;

public class Main {

    static int[][] s;
    static int n;
    static int minValue = Integer.MAX_VALUE;

    public static int go(int index, ArrayList<Integer> first, ArrayList<Integer> second) {
//        for (int i = 0; i < first.size(); i++) {
//            System.out.print(first.get(i) + " ");
//
//        }
//        System.out.println();
//
//        for (int i = 0; i < second.size(); i++) {
//            System.out.print(second.get(i) + " ");
//        }
//        System.out.println();


        if (index == n) {

            if (first.size() != n / 2) {
                return -1;
            }
            if (second.size() != n / 2) {
                return -1;
            }

            int ab1 = 0;
            int ab2 = 0;
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n / 2; j++) {
                    if (i == j) continue;
                    ab1 = ab1 + s[first.get(i)][first.get(j)];
                    ab2 = ab2 + s[second.get(i)][second.get(j)];
                }
            }
            int diff = Math.abs(ab1 - ab2);
            minValue = Math.min(diff, minValue);
//            System.out.println("minValue = " + minValue);
//            System.out.println("--------");
            return minValue;

        }

        if (first.size() > n / 2) return -1;
        if (second.size() > n / 2) return -1;

        first.add(index);

//        System.out.println();
        go(index + 1, first, second);
        first.remove(first.size() - 1);

        second.add(index);
        go(index + 1, first, second);
        second.remove(second.size() - 1);

        return minValue;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        System.out.println(go(0, first, second));
    }
}