import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;

public class Subsequence {
    public static void GetSequence(int[] arr, int index, ArrayList<Integer> path){
        if (index == arr.length) {
            if (path.size()>0){
                System.out.println(path);
            }
        }else{
            GetSequence(arr,index+1,path);
            path.add(arr[index]);
            GetSequence(arr,index+1,path);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        GetSequence(arr,0,arrayList);
    }
}
