import java.util.Scanner;

public class main1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (number): ");
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2){
            System.out.println("It's Winter");
        } else if (month == 3 || month == 4 || month == 5){
            System.out.println("It's Spring");
        } else if (month == 6 || month == 7 || month == 8){
            System.out.println("It's Summer");
        } else if (month == 9 || month == 10 || month == 11){
            System.out.println("It's Autumn");
        } else {
            System.out.println("Unknown month!");
        }
    }
}