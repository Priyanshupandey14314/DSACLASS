package companyWise;
import java.util.Scanner;
public class singleDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n =sc.nextLine();
        int k = sc.nextInt();
        // Non-optimal approach
        /* 
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<k;i++){
            builder.append(n);
        }
        String newnum = builder.toString();
        System.out.println(newnum);
        // System.out.println(newnum.length());
        int sum =0;
        for(int i=0;i<newnum.length();i++){
            if(Character.isDigit(newnum.charAt(i))){
                sum+=(int)newnum.charAt(i) - '0';
            }
        }
        System.out.println("Sum is :"+sum);
        // RUSD
        while (sum >= 10) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10; 
                sum /= 10;
            }
            sum = temp;
        }
        System.out.println("Final Single Digit Sum is: " + sum);
        */
    // Optimal

        // Step 1: find digit sum of n
        int digitSum = 0;
        for (int i = 0; i < n.length(); i++) {
            digitSum += n.charAt(i) - '0';
        }

        // Step 2: multiply by k
        int total = digitSum * k;

        // Step 3: reduce to single digit (digital root)
        int result = digitalRoot(total);

        System.out.println("Final Single Digit Sum is: " + result);
    }

    static int digitalRoot(int num) {
        while (num >= 10) {
            int temp = 0;
            while (num > 0) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }
        return num;
    }
}
