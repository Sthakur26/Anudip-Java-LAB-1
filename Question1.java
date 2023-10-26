public class bank {
    private double amount;
    public bank(double initialAmount) {
        amount = initialAmount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        bank myBank = new bank(10000);
        myBank.withdraw(5000);
        myBank.deposit(5000);
        myBank.displayBalance();
    }
}
