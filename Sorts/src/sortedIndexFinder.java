import java.util.Scanner;

public class sortedIndexFinder {
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
    public static boolean isDuplicate(int[]arr,int number){
        for (int num : arr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    public static int findIndexOf(int[]array,int number){
        for (int i=0;i<array.length;i++){
            if (array[i]==number){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("how many elements do you need in the array ? ");
        int n=scn.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1+" no element : ");
            int inp=scn.nextInt();
            if (!isDuplicate(array,inp)){
                array[i]=inp;
            }else{
                while(isDuplicate(array,inp)){
                    System.out.println("Please give a unique number, the one you gave was there in the array before");
                    System.out.print(i+1+" no element : ");
                    inp=scn.nextInt();
                }
            }
            System.out.println();
        }


        System.out.println("Which element would you like to find the index of after it gets sorted ? ");
        int find=scn.nextInt();
        int pre=findIndexOf(array,find);
        ++pre;
        System.out.println(pre);
        array=sort(array);
        if (findIndexOf(array,find)!=-1) {
            int index = findIndexOf(array, find);
            System.out.println("After sorting the array "+find+" moved from the index "+pre+" to "+index);
        }else{
            System.out.println("Sorry the number you told to find the index of was not actually in the array");
        }

    }
}
