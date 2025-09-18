import java.util.Scanner;

public class RowiseSumMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter value on " + i + "," + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);

            }
            System.out.println("Sum of " + i + "th row is : " + sum);
            System.out.println("Max of " + i + "th row is : " + max);
            System.out.println("Min of " + i + "th row is : " + min);

        }
    }
}
