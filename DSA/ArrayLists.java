package DSA;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]) {
        // Integer , Float , Boolean , String
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add

        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get elements
        list.get(0);
        int element = list.get(1);
        System.out.println(element);

        // add element at index in between
        list.add(1,6);
         System.out.println(list);

        //  set element / changing element
        list.set(0,8);
        System.out.println(list);

        //  delete element
        list.remove(3);
        System.out.println(list);

        // size 
        int size = list.size();
        System.out.println(size);

        // loops in arraylist
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting in arraylist
        Collections.sort(list);
        System.out.println(list);
    }

    
}
