import java.util.HashMap;
import java.util.Map;
public class Words {
    public static Map<String, Boolean> word(String[] words) {
        Map<String, Boolean> x = new HashMap<>();

        for (String word : words) {
            x.put(word, x.containsKey(word));
        }

        x.replaceAll((k, v) -> v && x.get(k));

        return x;
    }

}
