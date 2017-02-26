import java.util.HashMap;
import java.util.Map;

public class IsUnique {
  public static void main(String...args) {
    System.out.println(isUnique("abcdefgh"));
    System.out.println(isUnique("abccdefgh"));
    System.out.println(isUnique("abcdefagh"));
  }

  private static boolean isUnique(String str) {
    int bits = 0;

    for (int i = 0; i < str.length(); i++) {
      int bitToCheck = 1 << str.charAt(i) - 'a';
      if ((bits & bitToCheck) == bitToCheck) {
        return false;
      }

      bits = bits | bitToCheck;
    }

    return true;
  }
}
