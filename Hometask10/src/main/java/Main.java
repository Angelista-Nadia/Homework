public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob");
        Person originalPerson = new Person("Ivan", 30, 89000, cat);

        Person clonedPerson = new Person(originalPerson.getName(),
                originalPerson.getAge(),
                originalPerson.getSalary(),
                originalPerson.getCat());

        clonedPerson.setName("Vasia");

        System.out.println("Original Person: " + originalPerson);
        System.out.println("Cloned Person: " + clonedPerson);

        System.out.println("Are original and cloned persons equal? " + originalPerson.equals(clonedPerson));
    }
}
