import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class getKPC {
    static Character[][] numToCharMap;
    public static List<String> KPC(int[] arr, int length, int index, String s){
        if (index == length){
            return new ArrayList<>(Collections.singleton(s));
        }
        List<String> stringlist=new ArrayList<>();
        for (int i=0;i<numToCharMap[arr[index]].length;i++){
            String scopy=String.copyValueOf(s.toCharArray());
            scopy=scopy.concat(numToCharMap[arr[index]][i].toString());
            stringlist.addAll(KPC(arr,length,index+1,scopy));
        }
        return stringlist;
    }
    public static void KPC(int[] number){

    }
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        // Prompt the user to input the number of digits
        System.out.print("Enter the number of digits: ");
        int n = scn.nextInt();

        // Create an array to store the digits
        int[] arr = new int[n];

        // Prompt the user to input the digits
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Function call to print all possible words
        KPC(arr);
    }
}
