import java.util.Scanner;
public class rotator {
    public static void main(String[] args) {

    }
    public void getArray(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Give me some numbers to store");
        System.out.println("How many numbers do you want to give ??");
        int[] arr=new int[scn.nextInt()];
        for (int i = 0; i<=arr.length-1; i++){
            System.out.println("Give the number "+(i+1)+" : ");
            arr[i]=scn.nextInt();
        }
        matrixCreator matrixer=new matrixCreator(arr);
        matrixer.makeArray(2,2);
    }
    public void rotate90(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<(i+1);j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        int left=0;
        int right= arr.length-1;

        while (left<right){
            for (int row=0;row<arr.length;row++){
                int temp= arr[row][left];
                arr[row][left]=arr[row][right];
                arr[row][right]=temp;
            }
            left++;
            right--;
        }
    }
}
