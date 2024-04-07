import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 10 000:");
        Scanner scanner = new Scanner(System.in);
        {
            long x = scanner.nextInt();

            long a = x / 1000;
            System.out.print(a);
            System.out.println(" тысячных");
            long b = x % 1000 / 100;
            System.out.print(b);
            System.out.println(" сотен");
            long c = x % 1000 % 100 / 10;
            System.out.print(c);
            System.out.println(" десяток");
            long d = x % 1000 % 100 % 10;
            System.out.print(d);
            System.out.println(" единиц");

            System.out.println("*****");
            int j = (int) Math.log10(x) + 1;
            System.out.print(j);
            System.out.println(" цифры в числе");
            System.out.println("*****");
        }
    }
}