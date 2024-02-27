public class Cat {
    public String name;
    public int age;
    public Cat() {
        System.out.println("Порода: Без породы");
    }
    public Cat(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("Кличка кота: " + name + " | Возрост: " + age);
    }
    public void NewName(String name) {
        String newName = name.replace("Мурка", "Мурр");
        System.out.println("=====================\n" + name + " сменила кличку на - " + newName);
    }
}

