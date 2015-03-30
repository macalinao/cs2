public class MyLinkedList<T> {

  public static void main(String[] args) {
    MyLinkedList<String> l = new MyLinkedList<>();

    l.add("peanut");
    l.add("butter");
    l.add("and");
    l.add("jelly");
    l.add("time");

    System.out.println(l.toString());

    System.out.println(l.removeFirst());
    System.out.println(l.removeLast());

    System.out.println(l.toString());

    l.addFirst("nutter");
    l.addLast("hour");

    System.out.println(l.toString());

    System.out.println(l.getFirst());
    System.out.println(l.getLast());

    System.out.println(new MyLinkedList<String>(new String[]{"this", "is", "a", "test"}));

  }

  Node<T> head;

  public MyLinkedList() {
  }

  public MyLinkedList(T[] els) {
    for (T e : els) {
      add(e);
    }
  }

  public void add(T val) {
    Node<T> n = new Node<>(val);
    if (head == null) {
      head = n;
      return;
    }

    Node<T> last = head;
    while (last.next != null) {
      last = last.next;
    }
    last.next = n;
  }

  public void addFirst(T val) {
    Node<T> n = new Node<>(val);
    if (head == null) {
      head = n;
      return;
    }

    n.next = head;
    head = n;
  }

  public void addLast(T val) {
    add(val);
  }

  public T getFirst() {
    if (head == null) return null;
    return head.val;
  }

  public T getLast() {
    if (head == null) return null;
    Node<T> last = head;
    while (last.next != null) {
      last = last.next;
    }
    return last.val;
  }

  public T removeFirst() {
    if (head == null) return null;
    Node<T> pop = head;
    head = pop.next;
    return pop.val;
  }

  public T removeLast() {
    if (head == null) return null;
    if (head.next == null) {
      T val = head.val;
      head = null;
      return val;
    }
    Node<T> last = head;
    while (last.next.next != null) {
      last = last.next;
    }
    Node<T> ret = last.next;
    last.next = null;
    return ret.val;
  }

  @Override
  public String toString() {
    if (head == null) {
      return "null";
    }

    Node<T> last = head;
    StringBuilder sb = new StringBuilder("[").append(last.val.toString());
    while (last.next != null) {
      last = last.next;
      sb.append(", ").append(last.val.toString());
    }
    return sb.append("]").toString();
  }

  static class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
      this.val = val;
    }
  }
}
