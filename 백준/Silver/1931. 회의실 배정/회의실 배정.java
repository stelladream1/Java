import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static class Time{
        int start;
        int end;
        Time(int start ,int end){
            this.start = start;
            this.end = end;
        }
    }


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Time [] time = new Time[t];
        for(int i =0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            time[i] = new Time(s,e);
        }

        Arrays.sort(time, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.end == o2.end){
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });

        int end = time[0].end;
        int count =1;
        for(int i =1; i< t; i++){
            if(end <= time[i].start){
                end = time[i].end;

                count=count+1;
            }
        }
        System.out.println(count);
    }
}

