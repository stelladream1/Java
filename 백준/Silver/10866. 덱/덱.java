import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push_front")) {
                int n = Integer.parseInt(s[1]);
                deque.addFirst(n);
            } else if (s[0].equals("push_back")) {
                int n = Integer.parseInt(s[1]);
                deque.addLast(n);
            } else if (s[0].equals("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append("-1");
                    sb.append("\n");
                }
                else{
                    int n = deque.removeFirst();
                    sb.append(n + "");
                    sb.append("\n");
                }

            } else if (s[0].equals("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append("-1");
                    sb.append("\n");
                }
                else{
                    int n = deque.removeLast();
                    sb.append(n + "");
                    sb.append("\n");
                }

            } else if (s[0].equals("size")) {
                sb.append(deque.size());
                sb.append("\n");
            } else if (s[0].equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1);
                    sb.append("\n");
                } else {
                    sb.append(0);
                    sb.append("\n");
                }
            } else if (s[0].equals("front")) {
                if (deque.isEmpty()) {
                    sb.append("-1");
                    sb.append("\n");
                }
                else{
                    int n = deque.getFirst();
                    sb.append(n + "");
                    sb.append("\n");
                }


            } else if (s[0].equals("back")) {
                if (deque.isEmpty()) {
                    sb.append("-1");
                    sb.append("\n");
                }
                else{
                    int n = deque.getLast();
                    sb.append(n + "");
                    sb.append("\n");
                }

            }


        }
        System.out.println(sb);

    }
}

