package companyWise;
import java.util.Scanner;
class ArmStrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
            sum += Math.pow(d, digits);
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}