
public class CatMain {
    public static void main(String[] args) {
        new Cat("Барсик", 5);
        Cat cat2 = new Cat("Мурка", 2);
        new Cat("Лео", 12);

        Cat cat = new Cat();
        cat.NewName(cat2.name);
    }
}
