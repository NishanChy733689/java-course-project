import java.util.Scanner;
public class grading_system {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Welcome to the grading system to doom the students\n");
        System.out.println("\t\t\t\tEnter a students marks");
        int marks= scn.nextInt()-10;
        System.out.println("What is the name of that student ?");
        scn.nextLine();
        String name=scn.nextLine();
        System.out.println("So your "+name+"'s marks is "+marks);
        String say=parse_sentence(marks,name);
        System.out.println(say);
    }
    public static String grade(int marks){
        if (marks>=90) {
            return "O";
        }else if (marks>=80) {
            return "A+";
        }else if (marks>=70) {
            return "A";
        }else if (marks>=60) {
        return "B";
        }else if (marks>=50) {
        return "C";
        }else if (marks>=25) {
        return "F";
        }else {
        return "Death sentence";
        }
    }
    public static String parse_sentence(int marks,String name){
        String grades=grade(marks);
        if (grades == "O"){
            return "Tell him he is the only best person in this world to to fail";
        }else if (grades == "F-"){
            return "He is the best student in the world to be A+";
        }else{
            return "The student"+name+"got (a/an) "+grades;
        }

    }
}
