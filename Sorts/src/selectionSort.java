import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class selectionSort {
    public static int[] sort(int[] array){
        int temp;
        int minimum_element=Integer.MAX_VALUE;
        for (int i=0;i<array.length-1;i++){
            int minimum_index=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[minimum_index]){
                    minimum_index=j;
                }
            }
            temp=array[minimum_index];
            array[minimum_index]=array[i];
            array[i]=temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random random=new Random();

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
