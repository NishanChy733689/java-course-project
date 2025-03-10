import java.util.*;
import java.util.List;
public class SubsetFInder {

    static Set<List<Integer>> output=new HashSet<>();

    public static List<List<Integer>> subsets(int[] arr){
        int n=arr.length;

        Arrays.sort(arr);

        help(0,new ArrayList<Integer>(),arr);

        List<List<Integer>> answer=new ArrayList<>(output);

        return answer;
    }
    public static void help(int first, ArrayList<Integer> curr, int[] array){
        if (first==array.length){

                output.add(new ArrayList<>(curr));
                return;

        }
        help(first+1,curr,array);
        curr.add(array[first]);
        help(first+1,curr,array);
        curr.remove(curr.size()-1);

    }

    public static void main(String[] args) {
        int[] nums={1,2,3,2,3,2};
        List<List<Integer>> result= subsets(nums);
        System.out.println(result);
    }
}
