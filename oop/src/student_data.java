import java.util.Scanner;
class student_data_gather{
    int age;
    int grade;
    String name;
    String major;

    student_data_gather(int a,int g,String n,String m){
        age=a;
        grade=g;
        name=n;
        major=m;
    }
    public void showMajor(){
        System.out.println(name+" has chosen "+major);
    }
}

public class student_data {
    static Scanner scn =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the student detail");
        System.out.print("Name : ");
        String name=scn.nextLine();
        scn.nextLine();
        System.out.print("Major : ");
        String major=scn.nextLine();
        scn.nextLine();
        System.out.print("Age :");
        int age=scn.nextInt();
        scn.nextLine();
        scn.nextLine();
        System.out.print("Gpa :");
        int grade=scn.nextInt();

        student_data_gather student=new student_data_gather(age,grade,name,major);

        student.showMajor();
    }
}
