public abstract class Employee {
    //Информация о сотруднике
    String firstName;
    String lastName;
    int experience;
    Post post;

    public Employee(String firstName, String lastName, int experience, Post post) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.post = post;
    }

    //Абстрактный метод, который будет реализован подклассами (вывод информации)
    public abstract void printInfo();
}
