public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Михаил", "Михайлов", 5);
        Worker worker2 = new Worker("Петр", "Петров", 3);
        Worker worker3 = new Worker("Роман", "Романов", 11);
        Director director1 = new Director("Сергей", "Сергеев", 10);

        // печать информации о сотрудникх
        director1.printInfo();
        worker1.printInfo();
        worker2.printInfo();
        worker3.printInfo();

        // назначение сотрудников под управление директора
        director1.addEmployee(worker1);
        director1.addEmployee(worker2);

        // печать информацию о директоре и его подчиненных
        System.out.println("\nInformation о директоре:");
        System.out.println(director1.firstName + " " + director1.lastName + " Стаж: " + director1.experience + " - Должность: " + director1.post);
        System.out.println("Подчиненные:");
        for (Employee subordinate : director1.subordinates) {
            System.out.println(subordinate.firstName + " " + subordinate.lastName);
        }

        // создание директора и один сотрудник в подчинение
        Director director2 = new Director("Ольга", "Ольгина", 4);
        director2.addEmployee(worker3);

        System.out.println("\nInformation о новом директоре:");
        System.out.println(director2.firstName + " " + director2.lastName + " Стаж: " + director2.experience + " - Должность: " + director2.post);
        System.out.println("Подчиненные:");
        for (Employee subordinate : director2.subordinates) {
            System.out.println(subordinate.firstName + " " + subordinate.lastName);
        }

        // созданный директор подчиняется существующему директору
        director1.addEmployee(director2);

        // вывод инфорамции с прямым и косвенным подчинением сотрудников
        System.out.println("\nНовая информация о директоре:");
        System.out.println(director1.firstName + " " + director1.lastName + " - Должность: " + director1.post);
        System.out.println("Подчиненные:");
        for (Employee subordinate : director1.subordinates) {
            System.out.println(subordinate.firstName + " " + subordinate.lastName);
            if (subordinate instanceof Director subDirector) {
                for (Employee subSubordinate : subDirector.subordinates) {
                    System.out.println("\t" + subSubordinate.firstName + " " + subSubordinate.lastName);
                }
            }
        }
        // выполнение метода по поиску сотрудника в подчинении
        System.out.println("\nПроверка: Есть ли в подчинении директора Сергеева сотродник 'Романов': " + director1.hasSubordinateEmployee("Романов"));
    }
}
