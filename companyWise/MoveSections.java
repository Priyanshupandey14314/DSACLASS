package companyWise;
import java.util.*;
public class MoveSections {
    public static String move4thAnd6th(String s) {
        StringBuilder mainPart = new StringBuilder();
        StringBuilder movedPart = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int posInGroup = (i % 6) + 1; // position within each group of 6

            if (posInGroup == 4 || posInGroup == 6) {
                movedPart.append(s.charAt(i)); // move 4th and 6th to end
            } else {
                mainPart.append(s.charAt(i)); // keep others
            }
        }
        return mainPart.toString() + movedPart.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(move4thAnd6th(str));
    }
}
