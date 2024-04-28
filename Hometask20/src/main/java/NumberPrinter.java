public class NumberPrinter extends Thread{
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(number);
            try {
                Thread.sleep(1000); // небольшая задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
