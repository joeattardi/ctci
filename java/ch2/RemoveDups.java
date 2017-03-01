public class RemoveDups {
  public static void main(String...args) {
    LinkedList list = new LinkedList(new Node(1));
    list.append(new Node(2));
    list.append(new Node(3));
    list.append(new Node(2));
    list.append(new Node(4));
    list.append(new Node(2));
    list.append(new Node(3));

    System.out.println(list);
    list.removeDups();
    System.out.println(list);
  }
}
