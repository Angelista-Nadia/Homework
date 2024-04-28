public class DaemonThread extends Thread{
    public void run() {
        while (true) {
            System.out.println("Поток демон работает");
            try {
                Thread.sleep(1000); // Спит 1 секунд
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
