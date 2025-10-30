package Strings;
import java.util.ArrayList;
import java.util.Scanner;
public class CharsFromPaired {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    // ArrayList<String> strlist = new ArrayList<>();
    String list = sc.nextLine();
    String[] arr = list.split(" ");
    StringBuilder builder = new StringBuilder();
    int i=0;
    int j = arr.length-1;
    int k=1;
    while (i<=j) {
        if(arr[i].length()>=k){
            builder.append(arr[i].substring(0,k));
        }
        else{
            builder.append(arr[i]);
        }
        if (i != j) {
                // Take last k chars from j-th string (if possible)
                if (arr[j].length() >= k) {
                    builder.append(arr[j].substring(arr[j].length() - k));
                } else {
                    builder.append(arr[j]); // take whole if smaller
                }
            }

            i++;
            j--;
            k++;
        }
        System.out.println(builder.toString());
    }
}
