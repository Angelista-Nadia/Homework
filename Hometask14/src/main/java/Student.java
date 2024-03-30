import java.util.List;

public class Student {
    private String name;
    private String gender;
    private int age;
    private List<String> classes;

    public Student(String name, String gender, int age, List<String> classes) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public List<String> getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}
