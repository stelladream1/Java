import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();


        if( min < 45){
            min = min + 15;
            hour = hour - 1;
            if(hour < 0){
                hour = 23;
            }
            else if(hour > 23){
                hour = 0;
            }
        }
        else{
            min = min - 45;
        }
        System.out.println(hour + " "+ min);
    }
}

