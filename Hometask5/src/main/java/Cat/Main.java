package Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Мурка", 2);
        Cat cat3 = new Cat("Лео", 12);

        cat1.printCatInfo();
        cat2.printCatInfo();
        cat3.printCatInfo();

        cat2.updateNewName("Мурр");

        cat2.printNewName();
    }
}
