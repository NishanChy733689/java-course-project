public class arrayMax {
    static int max=Integer.MIN_VALUE;
    public static int maxFinder(int[] array,int i){

        if (i>=array.length){
            return max;
        }
        if (array[i]>max){
            max=array[i];
        }
        maxFinder(array,i+1);

        return max;
    }

    public static void main(String[] args) {
        int[] arr={1597,1352,1741,1495,1345,1653,1712,1530,1590};
        int res = maxFinder(arr,0);
        System.out.println(res);
    }
}
