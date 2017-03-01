public class IsPalindrome {
  public static void main(String...args) {
    LinkedList list = new LinkedList(new Node(1));
    list.append(new Node(2));
    list.append(new Node(3));
    list.append(new Node(2));
    list.append(new Node(1));

    System.out.println(list.isPalindrome());
  }
}
