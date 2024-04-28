public class MinThread extends Thread{
    private int[] array;
    private int min = Integer.MAX_VALUE;

    public MinThread(int[] array) {
        this.array = array;
    }

    public void run() {
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
    }

    public int getMin() {
        return min;
    }
}
