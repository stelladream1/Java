import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if( 90<=t && t<=100){
            System.out.println('A');
        }
        else if( 80<=t && t<=89){
            System.out.println('B');
        }
        else if( 70<=t && t<=79){
            System.out.println('C');
        }
        else if( 60<=t && t<=69){
            System.out.println('D');
        }
        else{
            System.out.println('F');
        }
    }
}

