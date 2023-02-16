import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        String StrB = Integer.toString(b);

        int one = Integer.parseInt(StrB.substring(0, 1));
        int two = Integer.parseInt(StrB.substring(1, 2));
        int three = Integer.parseInt(StrB.substring(2, 3));

        System.out.println(a * three);
        System.out.println(a * two);
        System.out.println(a * one);
        System.out.println(a*b);


    }
}