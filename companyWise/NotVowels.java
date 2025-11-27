package companyWise;
import java.util.*;
public class NotVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();q
        String strarr[] = s.split(" ");
        for (int i = 0; i < strarr.length; i++) {
            boolean hasVowel = false;
            for (char c : strarr[i].toCharArray()) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    hasVowel = true;
                    break;
                }
            }

            // Print words that have NO vowels
            if (!hasVowel) {
                System.out.println(strarr[i]);
            }
    }
}
}
