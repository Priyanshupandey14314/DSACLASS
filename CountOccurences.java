import java.util.*;
public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[] = new int[n];
        ArrayImpMethods methods = new ArrayImpMethods();
        // methods.takeInput(n,arr);
        ArrayList<Integer> arr = new ArrayList<>();
        methods.TakeListInput(arr, n);
        
    }
}
