import java.util.Objects;

public class Person {
    private String name;
    private final int age;
    private final double salary;
    private final Cat cat;

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Cat getCat() {
        return cat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, cat);

    }
        @Override
        public String toString () {
            return "Person{name='" + name + "', age=" + age + ", salary=" + salary + ", cat=" + cat + '}';
        }
    }
