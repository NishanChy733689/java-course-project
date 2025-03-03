public class findMissingNum {
    public static int findMissing(int n,int[] arr){
        int starbucks=0;
        int kfc=(n*(n+1))/2;
        for (int i=0;i<arr.length;i++){
            starbucks+=arr[i];
        }
        return kfc-starbucks;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(findMissing(12,arr));
    }
}
