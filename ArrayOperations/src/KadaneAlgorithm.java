public class KadaneAlgorithm {
    private int max(int a, int b){
        return (a>b)?a:b;
    }

    //The main function to find the maximum sum of the sub-arrays of an array

    public int largestSum(int[] arr) {
        int len = arr.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_here = 0;
        for (int i : arr) {
            max_here += i;
            max_so_far = max(max_so_far, max_here);
        }
        return max_so_far;
    }
}
