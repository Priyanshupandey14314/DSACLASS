package Sets;

import java.util.HashSet;

public class CountCommons {
    public static void main(String[] args) {
        String s1 = "Quickbrownfox";
        String s2 = "Learnfromlearnys";
        HashSet<Character> hs = new HashSet<>();
        for(char ch:s1.toCharArray()){
            hs.add(ch);
        }
        // System.out.println(hs);
        
    }
}
