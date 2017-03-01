public class KthToLast {
  public static void main(String...args) {
    LinkedList list = new LinkedList(new Node(1));
    list.append(new Node(2));
    list.append(new Node(3));
    list.append(new Node(4));
    list.append(new Node(5));
    list.append(new Node(6));
    list.append(new Node(7));

    System.out.println(list.getKthFromLast(3));
    System.out.println(list.getKthFromLast(1));
  }
}
