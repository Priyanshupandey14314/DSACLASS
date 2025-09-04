import java.util.Arrays;

class BuiltInSort{
    public static void main(String[] args) {
        int arr[] = {45,21,68,89,21,56};
        Arrays.sort(arr);
        System.out.println("Ascending order:"+Arrays.toString(arr));
        // Descending order
        Integer[] nums ={56,89,55,11,45};
        Arrays.sort(nums, java.util.Collections.reverseOrder());
        System.out.println("Descending:"+nums);
    }
}