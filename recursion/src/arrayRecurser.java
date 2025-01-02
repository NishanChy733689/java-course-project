import java.util.Scanner;
import java.util.*;
public class arrayRecurser {
    static int finds=0;
    public void displayer(int[] array, int iter){
        if (iter == array.length){
            return;
        }
        System.out.println(array[iter]);
        displayer(array,iter+1);
    }
    public void displayerRev(int[] array, int iter){
        if (iter < 0 ){
            return;
        }
        System.out.println(array[iter]);
        displayerRev(array,iter-1);
    }
    public void indexHunter(int hunt, int[] map,int i){
        if (i== map.length){
            return;
        }
        if (map[i]==hunt){
            System.out.println(i);
            ++finds;
        }

        indexHunter(hunt,map,++i);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number of random numerical places to generate  : ");
        int n = scn.nextInt();

        // Generate random numbers
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(20); // Random numbers between 0 and 999999
        }
        new arrayRecurser().displayer(array,0);
        System.out.println("\n\n");
        new arrayRecurser().displayerRev(array,array.length-1);
        System.out.println("Ok no we know the places lets go\n hunting on one of them try searching one of them");
        new arrayRecurser().indexHunter(scn.nextInt(),array,0);
        if (finds==0){
            System.out.println("AWW! what  a bad luck you couldn't hunt that down");
        }else {
        System.out.println("Ok ok Now we are launching a missile so that we can \n hunt that down :}");
        }
    }
}
