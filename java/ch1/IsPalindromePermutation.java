import java.util.HashMap;
import java.util.Map;

public class IsPalindromePermutation {
  public static void main(String...args) {
    System.out.println(IsPalindromePermutation("Tact Coa"));
    System.out.println(IsPalindromePermutation("Tact Cot"));
    System.out.println(IsPalindromePermutation("babaz"));
    System.out.println(IsPalindromePermutation("babazxm"));
  }

  private static boolean IsPalindromePermutation(String str) {
    String normalizedStr = str.toLowerCase().replaceAll("\\s", "");
    boolean oddLength = normalizedStr.length() % 2 == 1;

    Map<Character, Integer> characterCounts = getCharacterCounts(normalizedStr);

    boolean found1 = false;
    for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
      if (entry.getValue() == 1) {
        if (found1 || !oddLength) {
          return false;
        } else {
          found1 = true;
        }
      } else if (entry.getValue() % 2 != 0) {
        return false;
      }
    }

    return true;
  }

  private static Map<Character, Integer> getCharacterCounts(String str) {
    Map<Character, Integer> map = new HashMap<>();
    
    for (int i = 0; i < str.length(); i++) {
      char chr = str.charAt(i);
      int count = map.containsKey(chr) ? map.get(chr) : 0;
      map.put(chr, count + 1);
    }

    return map;
  }
}
