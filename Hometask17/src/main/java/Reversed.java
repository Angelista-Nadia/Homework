import java.util.Scanner;
import java.util.function.Supplier;

public class Reversed {

    public static void main(String[] args) {
        Supplier<String> inputSupplier = () -> {
            System.out.print("Enter string: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        };

        String input = inputSupplier.get();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println(reversed);
    }
}