import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month: ");
        String month = scanner.nextLine();

        String season;
        switch (month){
            case "December" , "december" , "January" , "january" , "February" , "february" -> season = "It's Winter!";
            case "March" , "march" , "April" , "april" , "May" , "may" -> season = "It's Spring!";
            case "June" , "june" , "July" , "july" , "August" , "august" -> season = "It's Summer!";
            case "September" , "september" , "October" , "october", "November" , "november" -> season = "It's Autumn!";
            default -> season = "Unknown Month!";
        }
        System.out.println(season);
    }
}