import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mergeSort {
    public static void merge(int[]arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

        int[] LeftHalf=new int[n1];
        int[] RightHalf=new int[n2];

        for (int i=0;i<n1;i++){
            LeftHalf[i]=arr[l+i];
        }
        for (int j=0;j<n2;j++){
            RightHalf[j]=arr[j+m+1];
        }

        int i=0,j=0;
        int k=l;

        while(i< n1 && j< n2){
            if (LeftHalf[i]<=RightHalf[j]){
                arr[k]=LeftHalf[i];
                i++;
            }else{
                arr[k]=RightHalf[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=LeftHalf[i];
            i++;
            k++;
        }

        while(j<n1){
            arr[k]=RightHalf[j];
            j++;
            k++;
        }

    }


    public static void sort(int[]arr,int l,int r){
        if (l<r){
            int m=l+((r-l)/2);
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
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