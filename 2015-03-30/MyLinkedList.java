public class MyLinkedList<T> {

  public static void main(String[] args) {
    MyLinkedList<String> l = new MyLinkedList<>();

    l.add("peanut");
    l.add("butter");
    l.add("and");
    l.add("jelly");
    l.add("time");

    System.out.println(l.toString());
  }

  Node head;

  public MyLinkedList() {
  }

  public void add(T val) {
    Node<T> n = new Node<>(val);
    if (head == null) {
      head = n;
      return;
    }

    Node last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = n;
  }

  public String toString() {
    if (head == null) {
      return "null";
    }

    Node last = head;
    StringBuilder sb = new StringBuilder("[").append(last.val.toString());
    while (last.next != null) {
      last = last.next;
      sb.append(", ").append(last.val.toString());
    }
    return sb.append("]").toString();
  }

  static class Node<T> {
    T val;
    Node next;

    public Node(T val) {
      this.val = val;
    }
  }
}
