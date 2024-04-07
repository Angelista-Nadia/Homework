import java.util.function.Consumer;

public class Converter1 {
    public static void main(String[] args) {
        Consumer<String> convertToDollars = (rubSum) -> {
            try {
                double rub = Double.parseDouble(rubSum.split(" ")[0]);
                double usd = rub * 0.01; // Валютный курс: 1 RUB = 0.01 USD
                System.out.println(rubSum + " = " + usd);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input format.");
            }
        };

        convertToDollars.accept("1000 RUB");
    }
}