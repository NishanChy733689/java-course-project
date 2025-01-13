import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class iterSearchBinary {
    public static int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
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

    public static int binSearch(int[] arr, int search, int left, int right){
        if (right>=left){
            int mid=left+(right-left)/2;
            if (arr[mid]==search)
                return mid;
            if (arr[mid]>search)
                return binSearch(arr,search,left,mid-1);
            return binSearch(arr,search,mid+1,right);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("How many numbers do you need ?");
        int numberOfNumbers=scn.nextInt();
        Random random=new Random();
        int[] array = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            array[i] = random.nextInt(30) + 1; // Random numbers between 1 and 20
        }
        for (int i=0;i<numberOfNumbers;i++){
            System.out.println(array[i]);
        }
        array=quickSort(array, 0, numberOfNumbers - 1);
        System.out.println("Which number do you want to find between 1--30");
        int res=binSearch(array,scn.nextInt(),0,numberOfNumbers-1);

        if (res==-1){
            System.out.println("sorry that number couldn't be found in the array");
        }else {
            System.out.println(res);
        }
    }
}
}
