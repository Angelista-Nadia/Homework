package Cat;

public class Cat {
    private String name;
    private final int age;
    private final String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this(name, age, "Без породы");
    }

    public void printCatInfo() {
        System.out.println("Кличка: " + name + "; Возраст: " + age + "; Порода: " + breed);
    }

    public void updateNewName(String newName) {
        this.name = newName;
    }

    public void printNewName() {
        System.out.println("Новая кличка кошки: " + name);
    }
}
