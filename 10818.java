import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<num; i++){
            numbers.add(Integer.parseInt(st.nextToken()));

        }



        System.out.print(Collections.min(numbers));
        System.out.print(" ");
        System.out.print(Collections.max(numbers));
    }
}

