import java.util.*;

class UniqueNonUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int uni = 0;
        int non = 0;

        // Count unique and non-unique
        for (int val : mp.values()) {
            if (val == 1) uni++;
            else non++;
        }

        System.out.println("Product is :" +uni * non);
    }
}
