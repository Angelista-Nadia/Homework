public class StringMain4 {

    // Создать произвольный шаблон.
    // Сделать строку используя данный шаблон, вставим некоторые значения
    public static void main(String[] args) {
        String template = "{0}. My name is {1}.";
        String filledTemplate = template.replace("{0}", "Hi").replace("{1}", "Nadia");
        System.out.println(filledTemplate);
    }
}
