import java.util.ArrayList;
import java.util.Scanner;

public class Prime_deleter {
    ArrayList<Integer> sample=new ArrayList<>();
    ArrayList<Integer> result=new ArrayList<>();
    Prime_deleter(ArrayList<Integer> arr){
        sample.addAll(arr);
    }
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public ArrayList<Integer> getResult(){
        for (Integer i :sample){
           if (!isPrime(i)){
               result.add(i);
           }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        System.out.println("How many elements do you want ?");
        int limit= scn.nextInt();
        for (int i=0;i<limit;i++){
            nums.add(scn.nextInt());
 //           System.out.println();
        }
        Prime_deleter deleter=new Prime_deleter(nums);
        ArrayList<Integer> deleted_arr=new ArrayList<>();
        deleted_arr.addAll(deleter.getResult());

        for (Integer i:deleted_arr){
            System.out.println(i);
        }
    }
}
