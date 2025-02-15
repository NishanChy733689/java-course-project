public class confusing_operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 2;
        System.out.println("Ternary operator (Find largest number): \n");
        System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c));
        b+=3;
        System.out.println("(a--)+(++b)%(--c)/++a === " + calculator(a,b,c));
    }
    public static int calculator(int a, int b, int c){
        return (a--) + (++b) % (--c) / ++a;

    }
}
