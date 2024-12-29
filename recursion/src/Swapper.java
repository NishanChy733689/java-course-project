import java.util.ArrayList;
import java.util.Collections;

public class Swapper {
    public static void swapFirstLast(ArrayList<String> list) {
        if (list == null || list.size() < 2) {
            return; // Do nothing if list is null or has less than 2 elements
        }
        
        // Swap first and last elements
        int lastIndex = list.size() - 1;
        Collections.swap(list, 0, lastIndex);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        
        System.out.println("Before swapping: " + list);
        swapFirstLast(list);
        System.out.println("After swapping: " + list);
    }
}
