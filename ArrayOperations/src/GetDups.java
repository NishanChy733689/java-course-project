import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GetDups {
    public static void main(String[] args) {
        Duplicates finder=new Duplicates();
        int[] nums={1,1,1,1,2,3,4,5,6,8};
        System.out.println(Arrays.toString(finder.findDuplicate(nums)));
    }
}
class Duplicates{
    ArrayList<Integer> duplicates=new ArrayList<>();
    Set<Integer> check_arr=new HashSet<>();
    Set<Integer> check_list=new HashSet<>();
    protected Object[] findDuplicate(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (!check_arr.add(arr[i])){
                if (check_list.add(arr[i])){
                duplicates.add(arr[i]);
                }
            }
        }
        return duplicates.toArray() ;
    }

    public static int IsReapeating(int[] arr,int target){
        int counter=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target) counter++;
        }
        return counter-1;
    }
}
