const LinkedListNode =  require('./LinkedListNode');

class LinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
  }
  /* 
  First we have to create a new node. It's okay to pass a null head since we anyway need it null if the head is null
  Next, we say that this.head will be the node. Just in case if head was referenced to an already assigned node, then next of our new node
  will be the previous node and the head will now reference to the new node

  This solves the case for head

  Now coming to handling the tail, if tail is null we point it to the new node else we do nothing.
  
  */
  prepend(value) {
    const node = new LinkedListNode(value, this.head);
    this.head = node;

    if (!this.tail) {
      this.tail = node;
    }
  }
  append(value) {
    const node = new LinkedListNode(value);
    if (!this.head) {
      this.head = node;
      this.tail = node;

      return;
    }
    this.tail.next = node;
    this.tail = node;
  }
  appendByIteration(value) {
    let n = this.head;
    while(!n) {
      if(!n.next) {
        const node = new Node(value);
        n.next = node;
        this.tail = node;
        return;
      }
    }
  }

  print() {
    let nodes = this.head;
    while(!nodes) {
      console.log(nodes.data);
      nodes = nodes.next;
    }
  }
}

const node = new LinkedList();

node.append(10);
node.append(4);
node.prepend(5);
node.appendByIteration(9);

node.print();