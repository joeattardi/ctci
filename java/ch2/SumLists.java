public class SumLists {
  public static void main(String...args) {
    Node num1 = buildList(7, 1, 6, 2);
    Node num2 = buildList(5, 9, 2);

    Node sumList = sum(num1, num2);

    Node n = sumList;
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
    System.out.println();
  }

  private static Node sum(Node num1Node, Node num2Node) {
    int num1 = listToNumber(num1Node);
    int num2 = listToNumber(num2Node);

    int sum = num1 + num2;

    int firstDigit = sum % 10;
    Node head = new Node(firstDigit);
    Node tail = head;
    sum /= 10;

    System.out.println(sum);
    while (sum > 0) {
      int digit = sum % 10;
      Node n = new Node(digit);
      tail.next = n;
      tail = n;
      sum /= 10;
    }

    return head;
  }

  private static int listToNumber(Node head) {
    Node n = head;
    int num = 0;

    int i = 0;
    while (n != null) {
      num += (n.data * Math.pow(10, i++));
      n = n.next;
    }

    return num;
  }

  private static Node buildList(int...numbers) {
    Node head = new Node(numbers[0]);
    Node tail = head;

    for (int i = 1; i < numbers.length; i++) {
      Node n = new Node(numbers[i]);
      tail.next = n;
      tail = n;
    }

    return head;
  }
}
