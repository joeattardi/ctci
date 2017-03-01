public class ListIntersection {
  public static void main(String...args) {
    Node head1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);

    Node head2 = new Node(5);
    Node n6 = new Node(6);
    Node n7 = new Node(7);
    Node n8 = new Node(8);
    Node n9 = new Node(9);
    Node n10 = new Node(10);

    head1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n8;

    head2.next = n6;
    n6.next = n7;
    n7.next = n8;
    n8.next = n9;
    n9.next = n10;

    System.out.println(getIntersectingNode(head1, head2).data);
  }

  public static Node getIntersectingNode(Node head1, Node head2) {
    int length1 = getListLength(head1); 
    int length2 = getListLength(head2);

    int maxLength = Math.max(length1, length2);
    head1 = ensureLength(head1, length1, maxLength);
    head2 = ensureLength(head2, length2, maxLength);

    Node n1 = head1;
    Node n2 = head2;

    while (n1 != null) {
      if (n1 == n2) {
        return n1;
      }

      n1 = n1.next;
      n2 = n2.next;
    }

    return null;
  }

  private static Node ensureLength(Node head, int length, int ensureLength) {
    Node newHead = null;
    for (int i = 0; i < (ensureLength - length); i++) {
      newHead = new Node(0);
      newHead.next = head;
      head = newHead;
    }

    return head;
  }

  private static int getListLength(Node head) {
    int count = 0;

    Node n = head;
    while (n != null) {
      count++;
      n = n.next;
    }

    return count;
  }
}
