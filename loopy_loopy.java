import java.util.Scanner;
public class loopy_loopy {
    public static void main(String[] args){
        print10();
        Scanner scn=new Scanner(System.in);
        System.out.println("Now for the sum till n function enter the value of n :");
        int input_number=scn.nextInt();
        scn.nextLine();
        sumTillN(input_number);
        minMaxinput(scn);

    }


    public static void print10(){
        for (int i=10;i>0;i--){
            if (i%2!=0){
                System.out.println(i+" is odd in the range of 10-1");
            }
        }
        System.out.println("\n\n");
    }

    public static void sumTillN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum till "+n+" is "+sum+"\n\n");
    }

    public static void minMaxinput(Scanner scn){
        System.out.println("Now we will find the min and the max number.\nThe system will be done if you give only 0\n So give your first number");
        int input_num=scn.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        do{
            input_num=scn.nextInt();
            scn.nextLine();
            if (input_num!=0){
            if (input_num>max){
                max=input_num;
            }
            if (input_num<min) {
                min = input_num;
            }}
        }while(input_num!=0);
        System.out.println("The minimum number you gave was "+min);
        System.out.println("The maximum number you gave was "+max);
    }
}


