package companyWise;
import java.util.*;
public class RemoveWithPat {
    public static String remove(String s, String r){
        StringBuilder builder = new StringBuilder();
         int index = s.indexOf(r);
         char prev = s.charAt(index-1);
         String main = s.substring(0, index);
         builder.append(main);
         String remain = s.substring(r.length()-1,s.length());
         for(int i=0;i<r.length();i++){
            builder.append(prev);
         }
         builder.append(remain);
         return builder.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = sc.nextLine();
        System.out.println(remove(s, r));
        
    }

}
