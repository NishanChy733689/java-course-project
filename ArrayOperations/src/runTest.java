import java.util.ArrayList;
import java.util.Scanner;
public class runTest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] testArray={67,83,78,45,90,45,12,73,97,46,89};
        ArrayOperation operator = new ArrayOperation();
        System.out.print("You have got yourself a list : ");
        for (int i:testArray){
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Search for a number from the list");
        int search=scn.nextInt();
        scn.nextLine();
        System.out.println(operator.arrayElementFinder(testArray,search));
        System.out.println("\n\n");
        System.out.println("As a fun fact there is a span of min and max value in the list\n can you guess it ?");
        int guess=scn.nextInt();
        if (guess== operator.arraySpanner(testArray)){
            System.out.println("WOW you are a GENIUS mathematician");
        }else{
            System.out.println("NO it is : "+operator.arraySpanner(testArray));
        }
    }
}
