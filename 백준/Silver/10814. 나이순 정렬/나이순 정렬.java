import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static class Member {
        int age;
        String name;

        Member(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Member [] member = new Member[n];


        for(int i =0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            member[i] = new Member(age, name);
        }

        Arrays.sort(member, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for(int i =0; i< n; i++){
            System.out.println(member[i].age + " " + member[i].name);
        }

    }
}

