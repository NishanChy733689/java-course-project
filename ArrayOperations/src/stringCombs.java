import java.util.*;

public class stringCombs {
    static ArrayList<ArrayList<String>> output = new ArrayList<>();

    public static ArrayList<ArrayList<String>> combine(String[] arr) {
        help(0, new ArrayList<>(), arr);
        return output;
    }

    public static void help(int n, ArrayList<String> curr, String[] arr) {
        if (n == arr.length) {
            output.add(new ArrayList<>(curr)); // Add a copy of curr to output
            return; // Return to avoid further processing
        }

        // Process the current character
        char currentChar = arr[n].charAt(0);
        if (Character.isLetter(currentChar)) {
            // Include lowercase version
            curr.add(String.valueOf(Character.toLowerCase(currentChar)));
            help(n + 1, curr, arr);
            curr.remove(curr.size() - 1); // Backtrack

            // Include uppercase version
            curr.add(String.valueOf(Character.toUpperCase(currentChar)));
            help(n + 1, curr, arr);
            curr.remove(curr.size() - 1); // Backtrack
        } else {
            // If it's a digit, just add it as is
            curr.add(arr[n]);
            help(n + 1, curr, arr);
            curr.remove(curr.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String[] strings = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            strings[i] = String.valueOf(input.charAt(i)); // Use charAt to get characters
        }
        combine(strings); // Generate combinations
        System.out.println(output); // Print the result
    }
}
