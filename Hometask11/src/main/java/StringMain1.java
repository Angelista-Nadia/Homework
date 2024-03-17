public class StringMain1 {

    // Разбить строку по любому разделителю и вывести количество элементов
    public static void main(String[] args) {
        String str = "Hello, World, !";
        String[] parts = str.split(",");
        System.out.println("Number of elements after ',': " + parts.length);
    }
}
