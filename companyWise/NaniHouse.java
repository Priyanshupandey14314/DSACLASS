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
        int arr[] = {100,200,300,400,1200,18000,1800,2000,3000,10000};
        System.out.println(carriable(arr));
    }
}
