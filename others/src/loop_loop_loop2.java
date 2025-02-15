import java.util.Scanner;
public class loop_loop_loop2 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime");
        check_prime(scn.nextInt());
        scn.nextLine();
        System.out.println("Enter a number to see its prime factors");
        factorize(scn.nextInt());
    }
    public static boolean check_prime(int n){
        /*
        it checks if a number is prime or not
        easy
         */
        boolean is_prime=true;
        for (int div=2;div*div<=n;div++){
            if (n%div==0){
                is_prime=false;
                break;
            }
        }
        if (is_prime){
            System.out.println("it is a prime number");
            return true;
        }else{
            System.out.println("Sorry it is not a prime");
            return false;
        }
    }
    public static void factorize(int n){
        for (int div=2;div*div<=n;div++){
            while (n%div==0){
                n/=div;
                System.out.println(div);
            }
        }
        if (n!=1){
            System.out.println(n);
        }
    }
}
