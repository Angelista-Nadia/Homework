import java.util.Arrays;

public class hwork {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
            double sum = 0;
            for (int x : arr) {
                sum += x;
            }
             System.out.print("Первый массив: ");
             System.out.println(Arrays.toString(arr));
             System.out.println("Среднее арифметическое чисел равно: " + sum / arr.length);

        int run = arr.length;
        int half = run / 2;

        for(int i = 0 ; i < half ; ++i) {
            int j = arr[i];
            arr[i] = arr[run - 1 - i];
            arr[run - 1 - i] = j;
        }
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        System.out.print("Второй массив: ");
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1[i]; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println("Повторяющийся элемент: " + arr1[i]);
                    break;
                }
            }
        }
    }
}
