public class fibbonacci {
    public static void main(String[] args){
        int pre1=0;
        int pre2=1;
        int iter=100;
        int current=pre2;
        for (int i=0;i<=iter;i++){
            System.out.println(current+", ");
            current=pre1+pre2;
            pre1=pre2;
            pre2=current;

        }
    }
}
