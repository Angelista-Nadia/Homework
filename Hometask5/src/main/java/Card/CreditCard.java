package Card;

public class CreditCard {
    private final String accountNumber;
    private double currentBalance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = initialBalance;
    }
    public void addBalance(double balance) {    //Начисление суммы на счёт
        this.currentBalance += balance;
    }
    public void withdrawBalance(double balance) {   //Снятие суммы со счёта
        if (this.currentBalance - balance >= 0) {
            this.currentBalance -= balance;
        } else {
            System.out.println("На карте недостаточно средств: ");  //Если остаток суммы меньше 0
        }
    }
    public void displayCardInfo() {
        System.out.println("Номер счёта: " + accountNumber);
        System.out.println("Баланс: " + currentBalance);
    }
}
