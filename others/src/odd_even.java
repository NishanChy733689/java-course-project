import java.util.Scanner;
public class odd_even{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scn.nextInt();
        scn.nextLine();
        if(num%2==0){
            System.out.println("Your number is even (If else based result)\n");
        }else{
            System.out.println("Your number is odd (If else based result)\n");
        }
        switch(num%2){
            case 0:
                System.out.println("It is even (switch case)");
                break;
            case 1:
                System.out.println("It is odd (switch case)");
                break;
            }
        }
}

