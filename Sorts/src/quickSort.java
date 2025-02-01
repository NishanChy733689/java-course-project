import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quickSort {
    public static int[] swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public static int partition(int[] arr,int low,int high){
        int piv=arr[high];
        int i=low-1;
        for (int j=low;j<=high-1;j++){
            if (arr[j]<piv){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void sort(int[] arr,int low,int high){
        if (high>low){
            int piv=partition(arr,low,high);
            sort(arr,low,piv-1);
            sort(arr,piv+1,high);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random random=new Random();
        insertionSort sorter=new insertionSort();

        System.out.println("How many elements do you need in you array? ");
        int n=scn.nextInt();
        int[] array=new int[n];
        for (int i = 0; i<n; i++){
            array[i]= random.nextInt(70);
        }
        System.out.println("So the array we got you is : ");
        System.out.println(Arrays.toString(array));
        System.out.println("Now the sorted array is : ");
        sort(array,0,n-1);
        System.out.println(Arrays.toString(array));
    }
}

