import java.util.Scanner;

public class teneToOne{
    static int i;
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        i=scn.nextInt();
        new teneToOne().count();
    }
    public void count(){
        if (i<=0){
            return ;
        }else{
            System.out.println(i);
            i--;
            count();

        }
    }
}
