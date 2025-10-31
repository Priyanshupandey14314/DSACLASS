package companyWise;

import java.util.*;

public class PasswordMatching {

    public static void matchPass(String s, int t, int arr[]) {
        String r = s;

        for (int i = 0; i < t; i++) {
            // handle large rotation values
            int d = Math.abs(arr[i]) % r.length();

            if (arr[i] > 0) { // Left rotation
                r = r.substring(d) + r.substring(0, d);
            } 
            else if (arr[i] < 0) { // Right rotation
                r = r.substring(r.length() - d) + r.substring(0, r.length() - d);
            }
            // if arr[i] == 0, no rotation needed
        }

        if (s.equals(r)) {
            System.out.println("Accepted");
        } else {
            System.out.println("Try Again");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int t = sc.nextInt();
        int arr[] = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        matchPass(S, t, arr);
    }
}
