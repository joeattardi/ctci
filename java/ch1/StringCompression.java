public class StringCompression {
  public static void main(String...args) {
    System.out.println(compress(args[0]));
  }

  private static String compress(String str) {
    StringBuilder result = new StringBuilder();
    
    int count = 1;
    char prevChar = str.charAt(0);

    for (int i = 1; i < str.length(); i++) {
      char chr = str.charAt(i);
      if (chr != prevChar) {
        result.append(prevChar).append(count);
        count = 1;
        prevChar = chr;
      } else {
        count++;
      }
    }

    result.append(prevChar).append(count);

    return result.length() < str.length() ? result.toString() : str;
  }
}
