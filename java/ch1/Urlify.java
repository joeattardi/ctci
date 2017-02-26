public class Urlify {
  public static void main(String...args) {
    System.out.println(urlify("Mr John Smith    ")); 
    System.out.println(urlify("Hello World!  "));
  }

  private static void shiftArray(char[] arr, int pos) {
    for (int i = arr.length - 1; i > pos; i--) {
      arr[i] = arr[i - 1];
    }
  }

  private String urlify2(String str) {
    return String.join("%20", str.trim().split(" "));
  }

  private static String urlify(String str) {
    char[] chars = new char[str.length()];
    str.getChars(0, chars.length, chars, 0);

    int pos = 0;
    while (pos < str.length()) {
      if (chars[pos] == ' ') {
        shiftArray(chars, pos);
        shiftArray(chars, pos);
        chars[pos] = '%';
        chars[++pos] = '2';
        chars[++pos] = '0';
      }

      pos++;
    }

    return new String(chars);
  }
}
