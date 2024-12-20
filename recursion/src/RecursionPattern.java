public class RecursionPattern {
    public static void pzz(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Print 'n' before the recursive call
        System.out.print(n + " ");
        
        // Recursive call to the left
        pzz(n - 1);
        
        // Print 'n' in the middle
        System.out.print(n + " ");
        
        // Recursive call to the right
        pzz(n - 1);
        
        // Print 'n' after the recursive calls
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 3; // Input level
        pzz(n);
    }
}
