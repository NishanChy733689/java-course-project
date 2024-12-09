import java.util.Scanner;

public class saddlePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the matrix
        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find the saddle price
        for (int i = 0; i < n; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;

            // Find the minimum element in the current row
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if this minimum element is the maximum in its column
            boolean isSaddlePrice = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isSaddlePrice = false;
                    break;
                }
            }

            if (isSaddlePrice) {
                System.out.println("Saddle price: " + rowMin);
                sc.close();
                return;
            }
        }

        System.out.println("No saddle price found.");
        sc.close();
    }
}
