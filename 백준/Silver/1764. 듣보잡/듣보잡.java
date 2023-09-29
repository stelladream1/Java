import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static class Pokemon{
        int num;
        String name;

        Pokemon(int num, String name){
            this.num = num;
            this.name = name;
        }
    }
    static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashSet<String> hash = new HashSet<>();
        ArrayList<String> answer = new ArrayList<>();
        for(int i =0; i<n; i++){
            String s = sc.nextLine();
            hash.add(s);
        }
        for(int i = 0; i<m; i++){
            String s = sc.nextLine();
            if(hash.contains(s)){
                answer.add(s);
            }
        }
        Collections.sort(answer);

        for(int i =0; i<answer.size(); i++){
            sb.append(answer.get(i)).append("\n");
        }
        System.out.println(answer.size());
        System.out.println(sb);
    }
}

