public class AddTwoNumbers {
  private static class Node<E> {
    E e;
    Node<E> next;
    public Node(E e) {
      this.e = e;
    }
  }

  public AddTwoNumbers(Node l1, Node l2) {
    Node dummyHead = new Node(0);
    Node p = l1, q = l2, curr = dummyHead;
    int carry = 0;

    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = x + y + carry;
      carry = sum / 10;

      curr.next = new Node(sum % 10);
      curr = curr.next;

      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }

    if (p != null) p = p.next;
    if (q != null) q = q.next;

    return dummyHead.next;
  }
}
