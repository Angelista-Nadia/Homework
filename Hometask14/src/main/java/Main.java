import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Male", 18, List.of("Literature")));
        students.add(new Student("Olga", "Female", 33, List.of("Chemistry", "Literature")));
        students.add(new Student("Anton", "Male", 19, List.of("Programming")));
        students.add(new Student("Nikolay", "Male", 42, List.of("Programming", "Literature")));
        students.add(new Student("Mariya", "Female", 24, List.of("Chemistry", "Literature")));

        //Студенты мужчины
        List<Student> menStudents = new ArrayList<>();
        for (Student student : students){
            if (student.getGender().equals("Male")){
                menStudents.add(student);
            }
        }

        //Студенты старше 20 лет
        List<Student> students20 = new ArrayList<>();
        for (Student student : students){
            if (student.getAge() > 20){
                students20.add(student);
            }
        }

        //Студенты посещающие меньше 2 занятий
        List<Student> students2Classes = new ArrayList<>();
        for (Student student : students){
            if (student.getClasses().size() < 2){
                students2Classes.add(student);
            }
        }

        //Студенты посещающие занятие - программирование
        List<Student> studentsProgrammingClass = new ArrayList<>();
        for (Student student : students){
            if (student.getClasses().contains("Programming")){
                studentsProgrammingClass.add(student);
            }
        }

        System.out.println(menStudents);
        System.out.println(students20);
        System.out.println(students2Classes);
        System.out.println(studentsProgrammingClass);
    }
}
