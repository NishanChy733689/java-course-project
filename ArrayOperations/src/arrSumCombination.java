import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrSumCombination {
    public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> combination = new ArrayList<>();
        findCombinations(candidates, target, 0, combination, result);
        return result;
    }

    private static void findCombinations(int[] candidates, int target, int start, ArrayList<Integer> combination, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination)); // Found a valid combination
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) { // Only consider numbers that do not exceed the target
                combination.add(candidates[i]); // Choose the number
                findCombinations(candidates, target - candidates[i], i, combination, result); // Recur with reduced target
                combination.remove(combination.size() - 1); // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the target sum:");
        int target = scn.nextInt();
        System.out.println("Enter the number of candidates:");
        int n = scn.nextInt();
        int[] candidates = new int[n];
        System.out.println("Enter the candidates:");
        for (int i = 0; i < n; i++) {
            candidates[i] = scn.nextInt();
        }

        ArrayList<ArrayList<Integer>> combinations = combinationSum(candidates, target);
        System.out.println("Combinations that sum to " + target + ": " + combinations);
    }
}