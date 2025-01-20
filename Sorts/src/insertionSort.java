import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class insertionSort {
    public static int[] sort(int[] array){

        int len=array.length;
        for (int i=1;i<len;++i){
            int key=array[i];
            int j=i-1;
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];

                j-=1;
            }
            array[j+1]=key;
        }
        return array;
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
        System.out.println(Arrays.toString(sort(array)));
    }
}
