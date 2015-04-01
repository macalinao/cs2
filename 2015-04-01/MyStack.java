public class MyStack<T> {

  public static void main(String[] args) {
    MyStack<String> l = new MyStack<>();

    l.push("jelly");
    l.push("and");
    l.push("butter");
    l.push("peanut");

    System.out.println(l.toString());

    System.out.println(l.pop());

    System.out.println(l.toString());

    l.push("nutter");

    System.out.println(l.toString());

    System.out.println(l.peek());

    System.out.println(new MyStack<String>(new String[]{"this", "is", "a", "test"}));

  }

  Node<T> head;

  public MyStack() {
  }

  public MyStack(T[] els) {
    pushAll(els);
  }

  public int size() {
    if (head == null) return 0;
    int ct = 1;
    Node<T> n = head;
    while(n.next != null) {
      n = n.next;
      ct++;
    }
    return ct;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public void pushAll(T[] els) {
    for (T el : els) {
      push(el);
    }
  }

  public void popAll() {
    head = null;
  }

  public void push(T val) {
    Node<T> n = new Node<>(val);
    if (head == null) {
      head = n;
      return;
    }

    n.next = head;
    head = n;
  }

  public T peek() {
    if (head == null) return null;
    return head.val;
  }

  public T pop() {
    if (head == null) return null;
    Node<T> pop = head;
    head = pop.next;
    return pop.val;
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
