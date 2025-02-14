import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        if (sentence == null) return false;
        sentence = sentence.toLowerCase();
        boolean[] letters = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }
        for (boolean letter : letters) {
            if (!letter) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (isPangram(input))
            System.out.println("The string is a pangram.");
        else
            System.out.println("The string is not a pangram.");
        scanner.close();
    }
}
