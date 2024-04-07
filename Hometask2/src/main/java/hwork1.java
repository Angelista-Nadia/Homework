import java.util.Scanner;

public class hwork1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int run = scanner.nextInt();

        int[] arr = new int[run];

        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < run; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < run; ++i) {
            System.out.println(arr[i]);
        }
    }
}
