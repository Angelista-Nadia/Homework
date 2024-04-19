public class StringMain3 {

    // Cделать строку которая будет зеркальна текущей
    public static void main(String[] args) {
        String str = "Hello, World!";
        String mirrored = new StringBuilder(str).reverse().toString();
        System.out.println("Mirrored line: " + mirrored);
    }
}
