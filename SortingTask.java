    import java.util.*;
    public class SortingTask {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Integer[] marks = new Integer[n];
            for(int i=0;i<marks.length;i++){
                marks[i] = sc.nextInt();
            }
            Arrays.sort(marks);
            int sum=0;
            for(int j=0;j<5;j++){
                sum+=marks[j];
            }
            System.out.println("Sum of last 5 marks:"+sum);
            Arrays.sort(marks,java.util.Collections.reverseOrder());
            int sum2=0;
            for(int i=0;i<5;i++){
                sum2+=marks[i];
            }
            System.out.println("Sum of top 5 :"+sum2);
        }
    }
