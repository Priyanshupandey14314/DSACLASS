package Sets;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class IntroSets {
    public static void main(String[] args) {
        // Tree set is a sorted set that uses Red-Black Tree 
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(54);
        set1.add(14);
        set1.add(81);
        set1.add(10);
        System.out.println(set1);
        // HashSet is a unordered set that uses HasTable 
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(54);
        set2.add(14);
        set2.add(81);
        set2.add(10);
        System.out.println(set2);
        // Linked Hashset preserve order of input
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        lset.add(15);
        lset.add(45);
        lset.add(14);
        System.out.println(lset);
        // Functions of sets
        // 1- add() - adds an element in set
        //2- remove(val) - remove element val from set
        lset.remove(14);
        // 3- contains(element) - returns true or false 
        System.out.println(set1.contains(54));    
        // isEmpty() - returns true or false
        System.out.println(set1.isEmpty());
        // Size() - returns number of elements in set
        System.out.println(lset.size());
        // clear() - remove all elements of set
        lset.clear();
        System.out.println(lset);
        // Iterator
        for()
    }
}