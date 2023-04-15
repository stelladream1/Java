import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            if (str[0].equals("push")) {
                num = Integer.parseInt(str[1]);
                queue.add(num);
            } else if (str[0].equals("pop")) {
                if (!queue.isEmpty()) {
                    bw.write(queue.remove() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (str[0].equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (str[0].equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (str[0].equals("front")) {
                if (!queue.isEmpty()) {
                    bw.write(queue.peek() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (str[0].equals("back")) {
                if (!queue.isEmpty()) {
                    bw.write(num + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }
        bw.flush();
    }
}
