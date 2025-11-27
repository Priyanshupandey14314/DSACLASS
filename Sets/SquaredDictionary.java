import java.util.*;
class SquaredDictionary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int p:hs){
            System.out.println(p +" "+p*p);
        }
    }
}