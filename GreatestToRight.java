import java.util.Scanner;

class GreatestToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int nextGreater = 0; 
            for (int j = i; j < n; j++) {
                if (nums[j] > nums[i]) {
                    nextGreater = nums[j];
                    break;
                }
                
            }
            System.out.print(nextGreater + " ");
        }
    }
}
