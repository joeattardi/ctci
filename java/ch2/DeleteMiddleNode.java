public class DeleteMiddleNode {
  public static void main(String...args) {
    Node head = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    LinkedList list = new LinkedList(head);
    list.append(n2);
    list.append(n3);
    list.append(n4);
    list.append(n5);

    System.out.println(list);

    Node nodeToDelete = n3;
    deleteNode(nodeToDelete);

    System.out.println(list);
    
  }

  private static void deleteNode(Node nodeToDelete) {
    Node n = nodeToDelete;

    n.data = n.next.data;
    n.next = n.next.next;
  }
}
