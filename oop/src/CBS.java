interface Bank_Customer{

    void recieve_loan_pay(int money);
    void giveLoan(int money);
    void store_deposit(int money);
    void withdraw(int money);

}
class customer implements Bank_Customer{
    private int deposit;
    private int loan;
    @Override
    public void recieve_loan_pay(int payment) {
        if (payment<0){
            System.out.println("Transaction refused");
        }
        this.loan-=payment;
    }

    @Override
    public void giveLoan(int money) {
        if (loan<deposit*3){
            this.loan+=money;
        }else {
            System.out.println("Sorry pay your previous loan first");
        }
    }

    @Override
    public void store_deposit(int money) {
        this.deposit+=money;
    }

    @Override
    public void withdraw(int money) {
        this.deposit-=money;
    }
    public int get_deposit(){
        return deposit;
    }
    public int getLoan(){
        return loan;
    }
}
public class CBS {
    public static void main(String[] args) {
        customer me = new customer();
        me.store_deposit(10000);
        System.out.println(me.get_deposit());
        me.giveLoan(3000);
        System.out.println(me.getLoan());
        me.withdraw(8000);
    }
}