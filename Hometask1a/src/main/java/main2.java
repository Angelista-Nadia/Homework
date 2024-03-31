import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long x = scanner.nextInt();

        for (long y = 1; y <= x; y++){
            boolean num = false;
            if (y % 3 != 0){
                y++;
                num = true;
                if (y % 2 != 0){
                    y++;
                }
            }
            if (!num) System.out.println(y);
        }
        System.out.println("↑↑↑ Числа, которые деляться 3 и являются нечётными ↑↑↑");
    }
}