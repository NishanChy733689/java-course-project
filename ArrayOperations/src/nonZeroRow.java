import java.util.Scanner;

public class nonZeroRow {
    public static boolean isNonZero(int[][] arr,int row){
        row-=1;

        for (int j=0;j<arr[row].length;j++){
                if (arr[row][j]==0){
                    System.out.println("There is a zero in this row");
                    return true;
                }
        }

        System.out.println("There is no zero on the row");
        return false;
    }
    public static void largestSumRow(int[][] arr){
        int high_row=Integer.MIN_VALUE;
        int high_sum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int counter=0;
            for (int j=0;j<arr[i].length;j++){
                counter+=arr[i][j];
                if (counter>high_sum){
                    high_row=i+1;
                    high_sum=counter;
                }
            }
        }
        System.out.println("The highest sum was found on "+high_row+" and it was "+high_sum);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("How many rows do you want ?");
        int rows= scn.nextInt();
        System.out.println();
        System.out.println("How many columns do you want ?");
        int columns=scn.nextInt();
        System.out.println();
        int[][] array=new int[rows][columns];
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                array[i][j] = scn.nextInt();
                System.out.print("");
            }
            System.out.println();
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Which row do you want to search in  ?");
        isNonZero(array,scn.nextInt());
        largestSumRow(array);
    }

}
