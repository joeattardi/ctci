public class OneAway {
  public static void main(String...args) {
    System.out.println(isOneAway(args[0], args[1]));
  }

  private static boolean isOneAway(String s1, String s2) {
    if (s1.length() == s2.length()) {
      return isSubstitution(s1, s2);
    } else if (s1.length() == s2.length() + 1) {
      return isInsertion(s1, s2);
    } else if (s2.length() == s1.length() + 1) {
      return isInsertion(s2, s1);
    }

    return false;
  }

  private static boolean isSubstitution(String s1, String s2) {
    boolean foundDifference = false;

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        if (foundDifference) {
          return false;
        } else {
          foundDifference = true;
        }
      }
    }

    return foundDifference;
  }

  private static boolean isInsertion(String s1, String s2) {
    int index1 = 0;
    int index2 = 0;
    boolean foundDifference = false;

    while (index2 < s2.length()) {
      if (s2.charAt(index2) == s1.charAt(index1)) {
        index2++;  
      } else {
        if (foundDifference) {
          return false;
        } else {
          foundDifference = true;
        }
      }

      index1++;
    }

    if (index1 == index2 && !foundDifference) {
      return true;
    }

    if (foundDifference && index1 == s1.length() && index2 == s2.length()) {
      return true;
    }

    return false;
  }

