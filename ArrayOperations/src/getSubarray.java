import java.util.Arrays;
import java.util.Scanner;

public class getSubarray {
    public static int[] getSub(int[] arr,int start,int end){
        int[] sub=new int[end-start+1];
        int j=0;
        for(int i=start;i<=end;i++){
            sub[j]=arr[i];
            j++;
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(getSub(arr, 0, 9)));
    }
}
