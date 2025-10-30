package Strings;
import java.util.Scanner;
public class RotateAndCheckPalindrome {
    public static boolean isPalindrome(String s){
        StringBuilder builder = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            builder.append(s.charAt(i));
        }
        if(s.equals(builder.toString())){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    sc.next();
    String str1 = sc.nextLine();
    String s2 = sc.nextLine();
    int n = str1.length();
    int m = s2.length();
    // Rotating str1 to right
    str1 = str1.substring(n - k,k) + str1.substring(0, n - k);
    // Rotating str2 to left
    s2 = s2.substring(k,m-k) + s2.substring(0, k);
    String str3 = str1+s2;
    System.out.println(str3);
    boolean res = isPalindrome(str3);
    System.out.println(res);
    }

}
