import java.util.Scanner;

public class factorial {
    static int i;
    static int factor=1;

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       i=scn.nextInt();
        new factorial().factorialize();
    }
    public void factorialize(){
        if(i<=0){
            return;
        }else{
            factor*=i;
            System.out.println(factor);
            i--;
            factorialize();
        }
    }
}
