import java.io.*;
import java.util.*;

public class TargetSum  {
    public static void main(String[] args) throws Exception {
        // Example input
        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;

        // Start the recursive function
        printTargetSumSubsets(arr, 0, "", 0, target);
    }

    // Recursive function to find subsets with the given sum
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        // Base case: if we've reached the end of the array
        if (idx == arr.length) {
            // If the sum of the subset equals the target, print it
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }

        // Include the current element in the subset
        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);

        // Exclude the current element from the subset
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }
}
