import java.util.Scanner;

public class fibbonacci {
    static long pre=0;
    static  long current=1;
    static long temp;
    int iter=0;

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int i=scn.nextInt();
        System.out.println(pre);
        System.out.println(current);
        new fibbonacci().fibbo(i);
    }
    public  void fibbo(int limit){
        if (iter>=limit){
            return;
        }else{
            temp=current;
            current+=pre;
            System.out.println("No  " +iter+ " of the fibonacchi series : "+current);
            pre=temp;
            iter++;
            fibbo(limit);
        }
    }
}
