package Recursion;

public class Subsequence {

    public static void printSubsequence(String str, int idx, String newString) {

        if(idx == str.length()) {
            System.out.print(newString + " ");
            return;
        }

        char currChar = str.charAt(idx);
        // to be 
        printSubsequence(str, idx+1, newString+currChar);
        // not to be
        printSubsequence(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc"; // abc, ab, bc, ac, a, b, c
        printSubsequence(str, 0, "");
    }
    
}
