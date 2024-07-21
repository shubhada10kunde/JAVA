package Recursion;

public class TowerOfHanoi {

    public static void tower(int n, int src, int helper, int dest) {
         if(n==1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
         }
         tower(n-1, src, dest, helper);
         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
         tower(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 2;
        int src = 1;
        int helper = 2;
        int dest = 3;

        // tower(n, "S", "H", "D");
        tower(n, src, helper, dest);

    }
    
}
