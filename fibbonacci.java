public class fibbonacci {
    public static void main(String[] args){
        long pre1=0;
        long pre2=1;
        long iter=100;
        long current=pre2;
        for (int i=0;i<=iter;i++){
            System.out.println(current+", ");
            current=pre1+pre2;
            pre1=pre2;
            pre2=current;
        }
    }
}
