import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public double salary;
    public Cat cat;
    private int personCode;

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
        this.personCode = personCode;
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age, this.salary, this.cat);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return personCode == person.personCode;
    }

    @Override
    public int hashCode() {
        return personCode;
    }

    @Override
    public String toString () {
            return "Person{name='" + name + "', age=" + age + ", salary=" + salary + ", cat=" + cat + '}';
    }
}
