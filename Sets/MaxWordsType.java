package Sets;

import java.util.HashSet;
import java.util.Scanner;

public class MaxWordsType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String broken = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();
        for(char ch:broken){
            hs.add(ch);
        }
        String[] words = s.split(" ");
        
    }
}
