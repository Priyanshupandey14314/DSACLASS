import java.util.*;
public class CompareArrays {
 public static void main(String[] args) {
     Scanner sc =  new Scanner(System.in);
     System.out.println("Enter length of first array: ");
     int n =sc.nextInt();  
     int arr1[] = new int[n];
     System.out.println("Enter "+n+"elements: ");
     for(int i=0;i<n;i++){
        arr1[i] = sc.nextInt();
     }
     System.out.println("Enter length of 2nd array");
     int m = sc.nextInt();
     int arr2[] = new int[m];
     System.out.println("Enter "+m+"elements");
     for(int i=0;i<m;i++){
        arr2[i] = sc.nextInt();
     }
     for(int i=0;i<arr2.length;i++){
        int count =0;
        for(int j=0;j<arr1.length;j++){
            if(arr2[i]<arr1[j]){
                count++;
            }
        }
        System.out.println("For "+arr2[i]+":"+count);
     }
     
     }
 }
