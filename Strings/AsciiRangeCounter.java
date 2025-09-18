package Strings;
import java.util.Scanner;
public class AsciiRangeCounter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String in = sc.nextLine();
        int m= sc.nextInt();
        int n = sc.nextInt();
        int count =0;
        for(int i=0;i<in.length();i++){
            int ascii = (int)in.charAt(i);
            // System.out.println(ascii);
        if(ascii>=m && ascii<=n)
        {
            count++;
        }
        }
        System.out.println(count);
    }
}
