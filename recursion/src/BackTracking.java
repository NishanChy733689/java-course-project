import java.util.Scanner;

public class BackTracking {
    static int n = 4; // Default size of the board, can be updated based on user input
    static int[] ld = new int[30];
    static int[] rd = new int[30];
    static int[] cl = new int[30];

    public static int[][] makeBoard() {
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }
        return board;
    }

    public static void printSolution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + "  ");
            }

            System.out.println();
        }
    }

    public static boolean solveNQueen(int[][] board, int col)  {
        if (col >= n) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (ld[i - col + n - 1] != 1 && rd[i + col] != 1 && cl[i] != 1) {
                board[i][col] = 1;
                ld[i - col + n - 1] = rd[i + col] = cl[i] = 1;

                if (solveNQueen(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
                ld[i - col + n - 1] = rd[i + col] = cl[i] = 0;
            }

        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the size of the board
        System.out.print("Enter the size of the board (n x n): ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid board size. Please enter a positive integer.");
            return;
        }

        // Initialize the arrays based on the input size
        ld = new int[2 * n];
        rd = new int[2 * n];
        cl = new int[n];

        // Create the board
        int[][] board = makeBoard();

        // Attempt to solve the N-Queens problem
        if (solveNQueen(board, 0)) {
            System.out.println("Solution found:");
            printSolution(board);
        } else {
            System.out.println("No solution exists for the given board size.");
        }


        scanner.close();
    }
}
 