public class StringMain2 {

    // получить подстроку с определенной позиции до конца
    public static void main(String[] args) {
        String str = "Hello, World!";
        String sub = str.substring(5);
        System.out.println("Substring from position 5 to end: " + sub);
    }
}
