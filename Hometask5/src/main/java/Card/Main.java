package Card;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1234", 100.0);
        CreditCard card2 = new CreditCard("5678", 200.0);
        CreditCard card3 = new CreditCard("9101", 150.0);

        //Суммы начислений и снятия со счетов
        card1.addBalance(55.0);
        card2.addBalance(100.50);
        card3.withdrawBalance(75.25);

        System.out.println("Пермый карта: ");
        card1.displayCardInfo();

        System.out.println("\nВторой карта: ");
        card2.displayCardInfo();

        System.out.println("\nТретий карта: ");
        card3.displayCardInfo();
    }
}
