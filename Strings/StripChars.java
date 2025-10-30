package Strings;
import java.util.Scanner;
public class StripChars {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input = sc.nextLine();
        for(int i=k;i<input.length();i++){
            System.out.print(input.charAt(i));
        }

    }
}
