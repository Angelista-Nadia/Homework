import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {
    List<Employee> subordinates = new ArrayList<>();
    public Director(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience, Post.DIRECTOR);
    }

    // назначает кого-либо в подчинение
    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    // по фамилии определяем есть ли данный сотрудник в подчинении у директора
    public boolean hasSubordinateEmployee(String name) {
        for (Employee subordinate : subordinates) {
            if (subordinate.lastName.equals(name) || (subordinate instanceof Director && ((Director) subordinate).hasSubordinateEmployee(name))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printInfo() {
        System.out.println("Директор: " + firstName + " " + lastName + " Стаж:" + experience);
    }
}
