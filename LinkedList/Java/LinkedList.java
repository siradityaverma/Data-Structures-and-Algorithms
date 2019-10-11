class LinkedList {
  Node head;
  Node tail;
  private int length = 0;

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  void prepend(int value) {
    Node node = new Node(value);
    node.next = this.head;
    this.head = node;
    if (this.tail == null) {
      this.tail = node;
    }
    this.length++;
  }
  void append(int value) {
    this.length++;
    Node node = new Node(value);
    if (this.head == null) {
      this.head = node;
      this.tail = node;

      return;
    }
    node.next = null;
    this.tail.next = node;
    this.tail = node;
  }

  void appendByIteration(int value) {
    this.length++;
    Node node = this.head;
    while(node != null) {
      if(node.next == null) {
        Node newNode = new Node(value);
        node.next = newNode;
        this.tail = newNode;
        return;
      }
      node = node.next;
    }
  }

  void unshift() {
    if(this.head == null) {
      throw new NullPointerException("Cannot delete from empty linked list");
    }
    this.length--;
    this.head = this.head.next;
  }

  void pop() {
    if (this.head == null) {
      throw new NullPointerException("Cannot delete from empty linked list");
    }
    this.length--;
    Node node = this.head;
    while(node != null) {
      Node currentNode = node;
      Node nextNode = node.next.next;
      if(nextNode == null) {
        currentNode.next = null;
        this.tail = currentNode;
        return;
      }
      node = node.next;
    }
  }

  void pop(int index) {
    if (this.head == null) {
      throw new NullPointerException("Cannot delete from empty linked list");
    }
    Node node = this.head;
    int counter = 0;
    if (index == length) {
      this.pop();
      return;
    } else if (index == 1) {
      this.unshift();
      return;
    }
    while(node != null) {
      counter++;
      if (counter + 1 == index) {
        node.next = node.next.next;
        return;
      }
      node = node.next;
    }
  }

  void fromArray(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
      this.append(arr[i]);
    }
    this.length = arr.length;
  }

  void print() {
    Node node = this.head;
    while(node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }

  int getSize() {
    return this.length;
  }
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    // Do operations here
  }
}
