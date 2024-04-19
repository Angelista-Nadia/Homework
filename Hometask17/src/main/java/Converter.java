import java.util.function.Function;

public class Converter {
    public static void main(String[] args) {
        Function<String, Double> convertToDollars = (String sum) -> {
            double rubSum = Double.parseDouble(sum.split(" ")[0]);
            return rubSum * 0.01; // Валютный курс: 1 RUB = 0.01 USD
        };

        String sumInRub = "1500 RUB";
        double sumInUsd = convertToDollars.apply(sumInRub);
        System.out.println(sumInRub + " = " + sumInUsd + " USD");
    }
}