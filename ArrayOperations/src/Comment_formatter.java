import java.util.ArrayList;
import java.util.Scanner;
// Combinationer.java;

public class Comment_formatter {
    public static ArrayList<String> format(ArrayList<String> raw){
        ArrayList<String> comments=new ArrayList<>();

        for(int i=0;i<raw.toArray().length;i++){
            if (raw.get(i).contains("!")){
                String formated=raw.get(i);
                if(!formated.endsWith("!") && !formated.endsWith(".")){
                    formated+='.';
                }
                formated=String.format("%d-%s",i,formated);
                comments.add(formated);
            }

        }
        return comments;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList<String> rawComments=new ArrayList<>();


        System.out.println("How many comments do you have ?");
        int numC=scn.nextInt();
        scn.nextLine();
        for(int i=0;i<numC;i++){
            System.out.println("Enter the comment no "+i);
            rawComments.add(i,scn.nextLine());
        }
        System.out.println("The formated comments are given below");
        ArrayList<String> formatedComments=format(rawComments);
        for (int i=0;i<formatedComments.toArray().length;i++){
            System.out.println(formatedComments.get(i));
        }
        System.out.println("The given format of the string is %d-%s ");
        Combinationer.main(new String[]{});
    }
}