import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            System.out.print("Enter "+i+"th element: ");
            arr.add(sc.nextInt());
        }
        
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Process every 2k block
        for(int start=0; start<n; start+=2*k){
            for(int i=0; i<k; i++){
                Collections.swap(arr, start+i, start+k+i);
            }
        }

        System.out.println("After swapping: " + arr);
    }
}
