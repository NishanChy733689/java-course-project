import java.util.Scanner;

public class StringsReversed {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String input=scn.nextLine();
        StringBuilder builder=new StringBuilder(input);
        builder.reverse();
        System.out.println(builder);
    }


}