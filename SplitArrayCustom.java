import java.util.Arrays;

public class SplitArrayCustom {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5, 9, 7, 6};

        int[] result = reorderByMinMaxSplit(arr);

        // print as digits
        StringBuilder sb = new StringBuilder();
        for (int v : result) sb.append(v);
        System.out.println(sb.toString()); // prints: 13524976
    }

    static int[] reorderByMinMaxSplit(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];

        // find min and max index (first occurrences)
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) minIndex = i;
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }

        // ensure minIndex < maxIndex
        if (minIndex > maxIndex) {
            int tmp = minIndex;
            minIndex = maxIndex;
            maxIndex = tmp;
        }

        // Part2 = between min and max (inclusive of min, exclusive of max)
        int[] part2 = Arrays.copyOfRange(arr, minIndex, maxIndex);
        // Part1 = before min
        int[] part1 = Arrays.copyOfRange(arr, 0, minIndex);
        // Part3 = from max to end
        int[] part3 = Arrays.copyOfRange(arr, maxIndex, n);

        // build result
        int[] out = new int[n];
        int pos = 0;
        for (int x : part2) out[pos++] = x;
        for (int x : part1) out[pos++] = x;
        for (int x : part3) out[pos++] = x;

        return out;
    }
}
