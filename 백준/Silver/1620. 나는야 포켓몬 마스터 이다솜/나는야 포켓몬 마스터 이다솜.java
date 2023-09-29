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
        Hashtable<Integer, String> hash1 = new Hashtable<>();
        Hashtable<String, Integer> hash2 = new Hashtable<>();

        for(int i =0; i<n; i++){
            String s = sc.nextLine();
            hash1.put(i,s );
            hash2.put(s,i);
        }

        for(int i =0 ;i <m; i++){
            String s = sc.nextLine();
            if(isInteger(s)){
                int k = Integer.parseInt(s);
                sb.append(hash1.get(k-1));
                sb.append("\n");
            }
            else{

                sb.append(hash2.get(s) + 1);
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }
}

