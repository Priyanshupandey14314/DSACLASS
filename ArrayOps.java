import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        // Array Equality
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};

        System.out.println(Arrays.equals(arr1, arr2)); // true
        System.out.println(Arrays.equals(arr1, arr3)); // false

        // Counting occurences of an element
         int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Element " + target + " occurs " + count + " times");

        // Finding index of an element
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        // Reversing an array
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));

    }
}
