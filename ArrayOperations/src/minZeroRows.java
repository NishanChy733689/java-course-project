import java.util.Arrays;

public class minZeroRows {
    public static int[] find(int[][] arr){
        int counter=0;
        int[] zeros=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==0){
                    counter+=1;
                }
            }
            zeros[i]=counter;
            counter=0;
        }
        return zeros;
    }

    public static void main(String[] args) {
        int[][] array={
                {1,2,3,4,0,0,0,0},
                {2,3,4,5,0},
                {2,4,0,214}
        };
        System.out.println(Arrays.toString(find(array)));
    }
}
