import java.util.Arrays;

public class hwork2 {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        
        for (int i : arr) {
            int num = 0;
            int rep = 0;
            for (int j : arr) {
                if (i == j) {
                    num++;
                    if (rep < num) {
                        rep = num;
                    }
                }
            }
            System.out.println(i + " повторяется " + rep + " раз");
        }
    }
}
