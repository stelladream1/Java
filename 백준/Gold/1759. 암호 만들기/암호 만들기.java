import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static boolean check(String password){
        int v = 0;
        int c = 0;

        for(char ch: password.toCharArray()){
            if( ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
                ++v;
            }
            else{
                ++c;
            }
        }
        if(v >=1 && c >= 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void go(int index, String password, String [] pw, int n){
        if(password.length() == n){
            if(check(password)){
                System.out.println(password);
            }
            return;
        }
        if(index >=pw.length){
            return;
        }
        for(int i =index; i<pw.length; i++){
                go(i+1,password + pw[i] , pw, n);



            }

    }

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();

        String [] pw = new String[m];

        for(int i =0; i<m; i++){
            pw[i] = sc.next();
        }

        Arrays.sort(pw);
        go(0,"", pw,n);

    }
}