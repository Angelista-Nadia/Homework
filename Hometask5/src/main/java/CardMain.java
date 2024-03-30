import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardMain {
    public static void main(String[] args) throws IOException {
        CreditCard card = new CreditCard();
        card.BankCard();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Сколько вы хотите положить на карты?");
                card.investMoney(Double.parseDouble(reader.readLine()));

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Сколько вы хотите снять с карты?");
            try {
                card.getMoney(Double.parseDouble(reader1.readLine()));
                break;
            } catch (CreditCard.balanceException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(card);
    }
}
