import java.util.HashSet;
import java.util.Set;

public class LongestSubSequentArray {
    public static int find(int[] array){
        Set<Integer> int_set=new HashSet<>();
        for(int n:array){
            int_set.add(n);
        }
        int max_len=0;
        for (int n:array){
            int len=0;
            if (int_set.contains(n-1)){
                while(int_set.contains(n+1)){
                    n++;
                    len++;
                }
            }
            max_len=Math.max(max_len,len);
        }
        return max_len;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,4,5,5,7,8,9,10,11,12,13,14};
        System.out.println(find(arr));
    }
}
