import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bubbleSort {
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
    public static int[] sort(int[] array){
        int temp,i,j;
        boolean swapped;
        for (i=0;i<array.length-1;i++){
            swapped=false;
            for(j=0;j<array.length-1;j++){
                if (array[j+1]>array[j]){
                    swapped=true;
                    array[j+1]=array[j+1]+array[j];
                    array[j]=array[j+1]-array[j];
                    array[j+1]=array[j+1]-array[j];
                }
            }
            if (!swapped){
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        swap(10,5);
        Random random=new Random();
        Scanner scn=new Scanner(System.in);
        System.out.println("How many elements do you need in your array ? : ");
        int n= scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(20) + 1; // Random numbers between 1 and 20
        }
        System.out.println(Arrays.toString(array));

        System.out.println("You can see that it is messy and not sorted let me clean it out ");

        System.out.println("So the sorted version of the array is : ");
        System.out.println(Arrays.toString(sort(array)));

    }
}
