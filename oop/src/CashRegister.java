public class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount; // To keep track of items purchased

    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++; // Increment item count for each purchase
    }

    public int getItemCount() {
        return itemCount;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0; // Reset item count after change is given
        return change;
    }

    // Static method to count total items across an array of CashRegister objects
    public static int countTotal(CashRegister[] registers) {
        int totalItems = 0;
        for (CashRegister register : registers) {
            totalItems += register.getItemCount();
        }
        return totalItems;
    }
}
