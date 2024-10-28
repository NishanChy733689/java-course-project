import java.util.Scanner;

public class except_me {
    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {
        try{
            int a=scn.nextInt();
            scn.nextLine();
            int b=scn.nextInt();
            System.out.println("a/b == "+a/b);
        }catch(Exception e){
            System.out.println("Why cant you give the numbers correctly!!! \uD83D\uDE21\uD83D\uDE21\uD83D\uDE21");
        }finally {
            System.out.println("\n\n ok ok i for give you \uD83D\uDE07\uD83D\uDE07\uD83D\uDE07");
        }
    }
}
