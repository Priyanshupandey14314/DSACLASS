package Strings;
import java.util.Scanner;
public class TransformStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                letters.append(Character.toLowerCase(ch));
            }
            else{
                symbols.append(ch);
            }
        }
        System.out.println(letters.toString()+symbols.toString());
    }    
}
