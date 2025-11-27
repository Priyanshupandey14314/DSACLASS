package Sets;
import java.util.TreeSet;
public class UniqueNumbers {
    public static void main(String[] args) {
        int arr[] = {10,2,3,4,2,5,6,4,2,3,6};
        TreeSet<Integer> set1 = new TreeSet<>();
        for(int item:arr){
            set1.add(item);
        }
        System.out.println(set1);
    }
}
