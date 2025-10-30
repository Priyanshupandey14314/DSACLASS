package Strings;
import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            builder.append(str.charAt(i));
        }
        System.out.println(builder.toString());
        if(str.equals(builder.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
