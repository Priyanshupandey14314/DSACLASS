import java.util.Scanner;

public class SwapKelementsmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter value on " + i + "," + j + " : ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        for (int i = 0; i < m / 2; i++) {
            int opp = m - i - 1; // opposite row
            for (int j = 0; j < k; j++) {
                int temp = mat[i][n - k + j];
                mat[i][n - k + j] = mat[opp][j];
                mat[opp][j] = temp;
            }
        }

        System.out.println("mat after swapping:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
