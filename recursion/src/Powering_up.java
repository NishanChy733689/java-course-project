public class Powering_up {
    int xpn=1;
    public int power(int x, int n){
        if (n==0){
            return 1;
        }
        int xnpb2=power(x,n/2);
        xpn=xnpb2*xnpb2;
        if (n%2==1){
            xpn*=x;
        }
        return xpn;
    }

    public static void main(String[] args) {
        System.out.println(new Powering_up().power(2,3));
    }
}
