import java.util.ArrayList;

public class findFactors {
    public static ArrayList<Integer> getFactors(int num){
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=(num/2);i++){
            if (num%i==0){
                factors.add(i);
            }
        }
        factors.add(num);
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(getFactors(20));
    }
}
