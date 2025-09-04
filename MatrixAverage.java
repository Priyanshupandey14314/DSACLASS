import java.util.Scanner;
public class MatrixAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        int sum =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter element on ["+i+"] ["+j+"] :");
                matrix[i][j] = sc.nextInt();
                sum+=matrix[i][j];
            }
        }
        double average = (double) sum / (row * col);
        System.out.printf("Average of matrix elements: %.1f%n", average);

    }
}
