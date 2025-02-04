import java.util.Scanner;
import java.util.Arrays;
public class anagramchecker{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String firstWord=scn.nextLine();
        String secondWord= scn.nextLine();
        if (firstWord.length()!=secondWord.length()){
            System.out.println("not an Anagram");
        }else{
            char[] ch1=firstWord.toCharArray();
            Arrays.sort(ch1);
            char[] ch2=secondWord.toCharArray();
            Arrays.sort(ch2);

            String firstSort= Arrays.toString(ch1);
            String secondSort= Arrays.toString(ch2);
            if (firstSort.equalsIgnoreCase(secondSort)){
                System.out.println("It Is AN Anagram");
            }else{
                System.out.println("No it is not an Anagram");
            }


        }
    }
}
