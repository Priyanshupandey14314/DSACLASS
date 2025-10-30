package companyWise;
import java.util.*;
public class NaniHouse {
    public static int carriable(int arr[]){
        int total = 0;
        int toys =0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
            if(total<5000){
                toys++;
            }
        }
        return toys;
    }
    public static void main(String[] args) {
        int arr[] = {200,800,1200,1500,500,800,4000};
        System.out.println(carriable(arr));
    }
}
