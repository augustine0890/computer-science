import java.util.Map;
import java.util.HashMap;

public class CountDuplicateChar {
    static void countDuplicateChar(String str) {
        Map<Character, Integer> countChar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            countChar.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        System.out.println(countChar);
    }
    public static void main(String[] args) {
        countDuplicateChar("##ABByzyz$%");
    }
}
