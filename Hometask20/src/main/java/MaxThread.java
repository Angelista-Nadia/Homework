public class MaxThread extends Thread{
    private int[] array;
    private int max = Integer.MIN_VALUE;

    public MaxThread(int[] array) {
        this.array = array;
    }

    public void run() {
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
    }

    public int getMax() {
        return max;
    }
}
