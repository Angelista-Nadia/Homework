public class Main {
    public static void main(String[] args) {
        String[] words = {"a", "b", "a", "c", "b"};
        System.out.println(Words.word(words));

        String[] words1 = {"c", "b", "a"};
        System.out.println(Words.word(words1));

        String[] words2 = {"c", "c", "c", "c"};
        System.out.println(Words.word(words2));
    }
}
