package Strings;
import java.util.Scanner;
public class RotateStringLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        // normalize k in case it's equal to n
        k = k % n;
        // rotate using substring
        String rotated = s.substring(k) + s.substring(0, k);
        // Right
        String rightrot = s.substring(n - k) + s.substring(0, n - k);
    }
}
