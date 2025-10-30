package Strings;
import java.util.Scanner;
public class RotateBySquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                int num = str.charAt(i);
                sum = sum+(num*num);
            }
        }
        str = str.replace("[0-9]", "");
        int k = sum;
        System.out.println(k);
        if(k%2==0){
            // Right Rotate
            // rotate using substring
        String rotated = str.substring(k) + str.substring(0, k);
        // Right
        
        }
        else{
            // Left rotate
            String rightrot = str.substring(n - k) + str.substring(0, n - k);
        }
    }
}
