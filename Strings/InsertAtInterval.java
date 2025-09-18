package Strings;
import java.util.Scanner;
public class InsertAtInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            result.append(a.charAt(i));
            if ((i + 1) % n == 0 && i != a.length() - 1) {
                result.append(b);
            }
        }
        System.out.println(result);
    }
}
