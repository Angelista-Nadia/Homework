import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditCard {

    private String id;
    private double balance;
    private long number;

    public CreditCard(){
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNumber(long number) {
       this.number = number;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void getMoney(double sum) throws balanceException {
        if (balance < sum) throw new balanceException(balance, sum);
        balance -= sum;
        System.out.println("Баланс карты: " + balance);
    }
    public void investMoney(double sum) {
        balance += sum;
        System.out.println("Баланс карты: " + balance);
    }
    public void BankCard() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя владельца карты: ");
        setId(reader.readLine());
        System.out.println("Введите номер карты: ");
        setNumber(Long.parseLong(reader.readLine()));

        while (true) {
            System.out.println("Ведите баланс карты: ");
            try {
                setBalance(Double.parseDouble(reader.readLine()));
                break;
            } catch (NumberFormatException e) {
               // e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Кредитная карта создана \n" + this);
    }
    @Override
    public String toString() {
        return "CreditCard: " +
                "имя='" + id + '\'' +
                " Номер карты=" + number +
                " Баланс=" + balance;
    }
    public static class balanceException extends Exception {
        public balanceException(double balance, double sum) {
            super("Недостаточно средств на счёте \n Баланс: " + balance + "\n А вы хотите снять: " + sum);
        }
    }
}
