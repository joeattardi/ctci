public class StringRotation {
  public static void main(String...args) {
    System.out.println(isRotation(args[0], args[1]));
  }

  private static boolean isRotation(String s1, String s2) {
    int len = s1.length();
    if (len == s2.length() && len > 0) {
      String concat = s1 + s1;
      return isSubstring(concat, s2);
    }

    return false;
  }

  private static boolean isSubstring(String s1, String s2) {
    return s1.indexOf(s2) >= 0;
  }
}
