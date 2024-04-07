public class Main {
    public static void main(String[] args) {
        User user1 = new User("Krisov", 5, Profession.DIRECTOR);
        User user2 = new User("Koshkin", 9, Profession.WORKER);
        User user3 = new User("Korovin", 3, Profession.WORKER);
        User user4 = new User("Volkov", 12, Profession.WORKER);
        User user5 = new User("Cinitsa", 2, Profession.HR);
        User user6 = new User("Zaytsev",7, Profession.HR);

        System.out.println("Заработная плата:");

        user1.calculateSalary();
        user2.calculateSalary();
        user3.calculateSalary();
        user4.calculateSalary();
        user5.calculateSalary();
        user6.calculateSalary();

        user1.calculateSalaryBonus(5000);
        user2.calculateSalaryBonus(2000);
        user3.calculateSalaryBonus(500);
        user4.calculateSalaryBonus(2000);
        user5.calculateSalaryBonus(500);
        user6.calculateSalaryBonus(3000);
    }
}
