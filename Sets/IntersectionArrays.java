package Sets;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionArrays {
    public static void intersectArrays(int arr[][]){
        HashSet<Integer> s1 = new HashSet<>();
        for(int i=0;i<arr[0].length;i++){
            s1.add(arr[0][i]);
        }
        for(int i = 1; i < arr.length; i++){
            HashSet<Integer> s2 = new HashSet<>();
            for(int j = 0; j < arr[i].length; j++){
                if(s1.contains(arr[i][j])){
                    s2.add(arr[i][j]);
                }
            }
            s1 = s2;
        }
        System.out.println(s1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();
        int arr[][] = new int[n][size];
        for(int i=0;i<n;i++){
            for(int j=0;j<size;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        intersectArrays(arr);
    }
}