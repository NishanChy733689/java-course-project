import java.util.Random;
import java.util.Scanner;

public class QuickSortVisualizerDynamic {

    public static int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Visualize the current state of the array
            //visualizeArray(array);

            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }return array;
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partition index
    }

    private static void visualizeArray(int[] array) {
        clearScreen(); // Clear the previous output

        int max = findMax(array);

        for (int row = max; row > 0; row--) {
            for (int num : array) {
                if (num >= row) {
                    System.out.print(" | ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Print a base line below the bars
        for (int num : array) {
            System.out.print("---");
        }
        System.out.println();

        // Print numbers below the bars
        for (int num : array) {
            System.out.printf("%2d ", num);
        }
        System.out.println("\n");

        try {
            Thread.sleep(60); // Pause for visualization
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static void clearScreen() {
        // ANSI escape code to clear the screen and move the cursor to the top
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Input: Number of random numbers
        System.out.print("Enter the number of random numbers to generate and sort: ");
        int n = scanner.nextInt();

        // Generate random numbers
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(20) + 1; // Random numbers between 1 and 20
        }

        // Print original array as vertical bars
        System.out.println("Original array visualization:");
        visualizeArray(array);

        // Start timer
        long startTime = System.nanoTime();

        // Sort the array with visualization
        array=quickSort(array, 0, n - 1);

        // End timer
        long endTime = System.nanoTime();

        // Display sorting time
        long duration = endTime - startTime;
        System.out.println("sorted array : ");
        visualizeArray(array);
        System.out.printf("Sorting completed in %.6f milliseconds.%n", duration / 1_000_000.0);

        scanner.close();
    }
}
