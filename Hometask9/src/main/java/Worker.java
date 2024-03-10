public class Worker extends Employee{
    public Worker(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience,Post.WORKER);
    }

    @Override
    public void printInfo() {
        System.out.println("Рабочий: " + firstName + " " + lastName + " Стаж:" + experience);

    }
}
