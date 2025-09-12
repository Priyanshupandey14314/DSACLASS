import java.util.ArrayList;
import java.util.Scanner;
public class ArrayImpMethods {
    Scanner sc = new Scanner(System.in);
    // for arrays input
    public void takeInput(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i +"th element: ");
            arr[i] = sc.nextInt();
        }
    }
    // for ArrayLists input
    public void TakeListInput(ArrayList<Integer> list, int n){
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
    }
}
