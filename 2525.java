import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        int addHour = time / 60;

        int addMin = time % 60;


        min = min + addMin;
        if(min >= 60) {
            hour  =  hour + min / 60;
            min = min % 60;
        }
        hour = hour + addHour;
        if(hour >= 24){
            hour = hour - 24;
        }

        System.out.println(hour+ " "+ min);
    }
}

