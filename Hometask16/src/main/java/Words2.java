import java.util.HashMap;
import java.util.Map;

public class Words2 {

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> pairsMap = new HashMap<>();

        for (String str : strings) {
            pairsMap.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length() - 1)));
        }

        return pairsMap;
    }

    public static void main(String[] args) {

        String[] input1 = {"code", "bug"};
        System.out.println(pairs(input1));

        String[] input2 = {"man", "moon", "main"};
        System.out.println(pairs(input2));

        String[] input3 = {"man", "moon", "good", "night"};
        System.out.println(pairs(input3));
    }
}