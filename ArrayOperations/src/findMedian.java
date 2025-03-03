public class findMedian {
    public static int find(int[] arr) {
        int length = arr.length;
        if (length % 2 == 1) {
            return arr[(length ) / 2];
        }
        return arr[((length+1) / 2)];

    }

    public static void main(String[] args) {
        int[] odd = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(find(odd));
        int[] even={1,2,3,4,5,6,7,8,9,10};
        System.out.println(find(even));
    }
}

