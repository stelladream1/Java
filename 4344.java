import java.io.*;
import java.util.*;

public class Main {



    public static <dobule> void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int num = Integer.parseInt(st.nextToken());
            int[] array = new int[num];
            for (int j = 0; j < num; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }

            int sum = Arrays.stream(array).sum();
            double avg = sum / num;

            int cnt = 0;
            for (int j = 0; j < num; j++) {
                if(array[j] > avg){
                    cnt = cnt + 1;
                }
            }
            double result = (double) cnt / num * 100;

            System.out.println(String.format("%.3f", result ) + "%");
        }



    }
}

