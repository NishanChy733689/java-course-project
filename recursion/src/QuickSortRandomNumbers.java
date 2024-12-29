import java.util.Random;
import java.util.Scanner;

public class QuickSortRandomNumbers {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Input: Number of random numbers
        System.out.print("Enter the number of random numbers to generate and sort: ");
        int n = scanner.nextInt();

        // Generate random numbers
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000000); // Random numbers between 0 and 999999
        }

        // Print original array
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Start timer
        long startTime = System.nanoTime();

        // Sort the array
        quickSort(array, 0, n - 1);

        // End timer
        long endTime = System.nanoTime();

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display sorting time
        long duration = endTime - startTime;
        System.out.printf("Sorting completed in %.6f milliseconds.%n", duration / 1_000_000.0);

        scanner.close();
    }
}
