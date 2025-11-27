import java.util.*;

class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Count frequency
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Put unique elements in a list
        ArrayList<Integer> list = new ArrayList<>(freq.keySet());

        // Step 3: Sort based on frequency
        // For ascending order -> freq.get(a) - freq.get(b)
        // For descending order -> freq.get(b) - freq.get(a)
        
        Collections.sort(list, (a, b) -> freq.get(b) - freq.get(a)); // descending

        // Step 4: Print sorted unique elements
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
