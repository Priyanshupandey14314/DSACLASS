import java.util.Scanner;
class SwapMatrix{
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
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n-1;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i+1][j+1];
                arr[i+1][j+1] = temp;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.err.println();
        }
    }
}