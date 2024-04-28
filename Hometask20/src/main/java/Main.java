public class Main {
    public static void main(String[] args) {

        //Создать поток используя два способа - через наследованное и имплементируя интерфейс Runnable
        //Оба потока должны стартовать, после чего основной поток должен дождаться их завершения
        // и прекратить работу.
        ThreadFirst thread1 = new ThreadFirst();
        Thread thread2 = new Thread(new ThreadSecond());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Потоки прерваны");
        }

        System.out.println("Оба потока завершены.");

        //Есть массив целых чисел.
        //Необходимо создать два потока - один из которых будет считать максимальное значение,
        // а второй - минимальное.
        // Запустить оба потока и дождаться их окончания. Вывести на экран результат вычислений.
        int[] numbers = {5, 12, 3, 8, 9, 15, 1, 7};

        MaxThread maxThread = new MaxThread(numbers);
        MinThread minThread = new MinThread(numbers);

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Max value: " + maxThread.getMax());
        System.out.println("Min value: " + minThread.getMin());

        //Создать поток демон и проверить его работу
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        try {
            Thread.sleep(5000); // поток спит 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Выход из потока");

        //Есть два потока - один выводит в бесконечном цикле 3 раза цифру "1" (3 вызова System.out.println),
        //а второй аналогично - цифру "2". Предусмотреть небольшую задержку.
        //Задача - сделать синхронизацию потоков (пока один не закончит вывод трех чисел, второй будет ждать -
        //не будет перемешивания)
        //Проверить что в консоли вы получите поочередное выполнение потоков.
        NumberPrinter threadOne = new NumberPrinter(1);
        NumberPrinter threadTwo = new NumberPrinter(2);

        threadOne.start();
        try {
            threadOne.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadTwo.start();
    }
}
