import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Arrays;

public class dupRemover {
    public static boolean is_dup(int[] arr,int target){
//        for(int n:arr){
//            if (n==target){
//                return true;
//            }
//        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static int[] remove(int[] arr){
        int[] result=new int[arr.length];
        ArrayList<Integer> res=new ArrayList<>();
//       int i=0;
//        for(int n:arr){
//            if (!is_dup(arr,n)){
//                result[i]=n;
//            }
//            i++;
//        }
        for(int i=0;i<arr.length;i++){
            if(!is_dup(arr,arr[i])){
                result[i]=arr[i];

                res.add(arr[i]);
                System.out.println(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,3,3,4,5,6};
        System.out.println(Arrays.toString(remove(arr)));
    }

}

