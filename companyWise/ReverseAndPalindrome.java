package companyWise;

import java.util.*;

public class ReverseAndPalindrome {
    public static boolean checkPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        int mid = s.length() / 2;
        // if(s.length()%2!=0){

        // }
        String first = s.substring(0, mid);
        String second = s.substring(mid, s.length());
        String revfirst = new StringBuilder(first).reverse().toString();
        String revSec = new StringBuilder(second).reverse().toString();
        System.out.println(revfirst);
        System.out.println(revSec);
        result.append(revfirst);
        result.append(revSec);
        String pl = result.reverse().toString();
        System.out.println(pl);
        String original = result.toString(); // keep original
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s));
    }

}
