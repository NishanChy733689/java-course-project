import java.util.Scanner;
public class leap_year_finder {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=input.nextInt();
        boolean leapyear=(year%4==0)?((year%100==0)?((year%400==0)?true:false):true):false;
        System.out.println("the year "+year+" is "+((leapyear==true)?"a leapyear":"not a leapear"));
        System.out.println();
    }
}
