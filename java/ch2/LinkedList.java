import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LinkedList {
  private Node head;

  public LinkedList(Node head) {
    this.head = head;
  }

  public void append(Node node) {
    Node n = head;
    while (n.next != null) {
      n = n.next;
    }

    n.next = node;
  }

  private void swap(Node n1, Node n2) {
    int tmp = n1.data;
    n1.data = n2.data;
    n2.data = tmp;
  }

  public boolean isPalindrome() {
    List<Integer> forwards = new ArrayList<>();
    Stack<Integer> backwards = new Stack<>();
    Node n = head;
    while (n != null) {
      forwards.add(n.data);
      backwards.push(n.data);
      n = n.next;
    }

    for (Integer i : forwards) {
      Integer j = backwards.pop();
      if (!i.equals(j)) {
        return false;
      }
    }

    return true;

  }

  public void partition(int pivot) {
    Node n = head;

    Node head1 = null;
    Node n1 = null;
    Node head2 = null;
    Node n2 = null;

    while (n != null) {
      if (n.data < pivot) {
        if (head1 == null) {
          head1 = new Node(n.data);
          n1 = head1;
        } else {
          n1.next = new Node(n.data);
          n1 = n1.next;
        }
      } else {
        if (head2 == null) {
          head2 = new Node(n.data);
          n2 = head2;
        } else {
          n2.next = new Node(n.data);
          n2 = n2.next;
        }
      }

      n = n.next;
    }

    n1.next = head2;
    head = head1;
  }

  public int getKthFromLast(int k) {
    Node end = head;

    for (int i = 0; i < k; i++) {
      end = end.next;
    }

    Node kthFromLast = head;
    while (end != null) {
      end = end.next;
      kthFromLast = kthFromLast.next;
    }

    return kthFromLast.data;
  }

  public void removeDups() {
    Set<Integer> seen = new HashSet<>();
    Node n = head;
    Node prev = null;

    while (n != null) {
      if (seen.contains(n.data)) {
        prev.next = n.next;
      } else {
        seen.add(n.data);
        prev = n;
      }

      n = n.next;
    }
  }

  public void delete(Node node) {
    Node n = head;
    while (n.next != node) {
      n = n.next; 
    }

    n.next = n.next.next;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    
    Node n = head;
    while (n != null) {
      sb.append(n.data).append(" ");
      n = n.next;
    }

    return sb.toString();
  }
}
