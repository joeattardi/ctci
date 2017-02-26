import java.util.HashMap;
import java.util.Map;

public class IsPermutation {
  public static void main(String...args) {
    System.out.println(isPermutation("foo", "oof"));  
    System.out.println(isPermutation("car", "acr"));  
    System.out.println(isPermutation("foo", "bar"));
  }

  private static Map<Character, Integer> getCharCounts(String str) {
    Map<Character, Integer> result = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char chr = str.charAt(i);
      if (!result.containsKey(chr)) {
        result.put(chr, 0);
      }

      int count = result.get(chr);
      result.put(chr, count + 1);
    }

    return result;
  }

  private static boolean isPermutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    Map<Character, Integer> s1CharCounts = getCharCounts(s1);
    Map<Character, Integer> s2CharCounts = getCharCounts(s2);

    return s1CharCounts.equals(s2CharCounts);
  }
}
