public class matrixCreator {
    int[] arr;

    matrixCreator(int[] array){
        this.arr=array;
    }
    public void makeArray(int n,int m){
        int[][] res=new int[n][m];
        int counter=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                res[i][j]=this.arr[counter];
                counter++;
            }

        }
        for (int i=0;i< res.length;i++){
            for (int j:res[i]){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
