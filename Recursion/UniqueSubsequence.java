package Recursion;
import java.util.HashSet;

public class UniqueSubsequence {

    public static void printSubsequence(String str, int idx, String newString, HashSet<String> set) {

        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
                System.out.print(newString + " ");
                set.add(newString);
                return;

            }
        }

        char currChar = str.charAt(idx);
        // to be 
        printSubsequence(str, idx+1, newString+currChar, set);
        // not to be
        printSubsequence(str, idx+1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa"; // abc, ab, bc, ac, a, b, c
        HashSet<String> set = new HashSet<>();
        printSubsequence(str, 0, "", set);
    }
    
}

    

