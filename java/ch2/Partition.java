public class Partition {
  public static void main(String...args) {
    LinkedList list = new LinkedList(new Node(3));
    list.append(new Node(5));
    list.append(new Node(8));
    list.append(new Node(5));
    list.append(new Node(10));
    list.append(new Node(2));
    list.append(new Node(1));

    System.out.println(list);
    list.partition(8);
    System.out.println(list);
  }
}
