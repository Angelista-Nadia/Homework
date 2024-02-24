
public class Cat {

    public Cat(String name, int age, String breed) {
        String newName = name.replace("Murka", "Murr");
        System.out.println(newName + ": " + age + " лет " + breed);
    }
}
