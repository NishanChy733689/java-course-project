class calc{
    int sum;
    calc(int sum) {
        this.sum = sum;
    }
}
class add extends calc{
    add(int sum) {
        super(sum);
    }

    public void addition(int i){
        this.sum+=i;
    }
}
class substract extends add{

    substract(int sum) {
        super(sum);
    }
    public void substraction(int i){
        this.sum-=i;
    }
}

class multiply extends substract{

    multiply(int sum) {
        super(sum);
    }
    public void multiplication(int i){
        this.sum*=i;
    }
}

class devide extends multiply{

    devide(int sum) {
        super(sum);
    }
    public void division(int i){
        this.sum/=i;
    }
}

class calcu extends devide{
    calcu(int sum) {
        super(sum);
    }
}
public class CALCULATOR {
    public void main(String[] args) {
        calcu calculator=new calcu(10);

        System.out.print(calculator.sum+" + "+5+"= ");
        calculator.addition(5);
        System.out.print(calculator.sum+"\n");

        System.out.print(calculator.sum+" - "+2+"= ");
        calculator.substraction(2);
        System.out.print(calculator.sum+"\n");

        System.out.print(calculator.sum+" * "+5+"= ");
        calculator.multiplication(5);
        System.out.print(calculator.sum+"\n");

        System.out.print(calculator.sum+" / "+3+"= ");
        calculator.division(3);
        System.out.print(calculator.sum+"\n");

    }
}

