import java.util.Scanner;
public class MaxProfit {
    public static void MaxProfit(int prices[]){
        int maxProfit =Integer.MIN_VALUE;
        int bp=prices[0];
        int sp=0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            bp=Math.min(bp,prices[i]);
            sp=prices[i];
            profit= Math.max(profit,sp-bp);
        }
        System.out.println("Max profit is: "+profit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        MaxProfit(prices);
    }
}
