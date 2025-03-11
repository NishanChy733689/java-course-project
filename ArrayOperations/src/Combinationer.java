import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Combinationer {
    static ArrayList<ArrayList<Integer>> output=new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> combine(int[] arr){
        int n=arr.length;
        help(0,new ArrayList<Integer>(),arr);
        return output;
    }
    public static void help(int n,ArrayList<Integer> curr,int[] arr){
        if (n==arr.length){
            output.add(new ArrayList<>(curr));
        }

        for (int i=n;i< arr.length;i++){
            curr.add(arr[i]);
            swap(arr,i,n);
            help(n+1,curr,arr);
            swap(arr,i,n);
            curr.removeLast();
        }
    }
    public static int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,1,3};
        ArrayList<ArrayList<Integer>> results=combine(arr);
        Set<ArrayList<Integer>> verify=new HashSet<>();
        ArrayList<ArrayList<Integer>> pr=new ArrayList<>();
        for(int i=0;i<results.size();i++){

                if(verify.add(results.get(i))){
                    pr.add(results.get(i));
                }

        }
        System.out.println(pr);
    }
}
