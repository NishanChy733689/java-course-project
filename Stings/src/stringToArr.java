import java.util.Scanner;

public class stringToArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        StringBuilder builder=new StringBuilder(word);
        builder.reverse();
        word=builder.toString();
        char[] arr=word.toCharArray();
        System.out.println(arr);

    }
}
