class Credit_card{
    private String credit_card_number="4682718906785673438";

    public void set_number(String number ,int pin){
        int pin1 = 4023;
        if (pin== pin1){
        this.credit_card_number=number;
    }}
    public String get_number(){
        return this.credit_card_number;
    }
    public void hack(){
        System.out.println("Hacked now transferring all money to to your account ||number"+this.credit_card_number);
    }

}



public class getter_setter {


    public static void main(String[] args) {
        Credit_card credit=new Credit_card();
        credit.set_number("1234578901234556",4023);
        System.out.println("Now i will hack it HEhhe why ;)");
        System.out.println(credit.get_number());
        credit.hack();
    }
}