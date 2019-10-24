class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node

    def insert_after(self, prev_node, new_data):
        if prev_node is None:
            print("Prev node should be a node in LL")
            return
        
        new_node = Node(new_data)
        new_node.next = prev_node.next
        prev_node.next = new_node

    def append(self, new_data):
        new_node = Node(new_data)

        if self.head is None:
            self.head = new_node
            return

        last = self.head

        while(last.next):
            last = last.next

        last.next = new_node
    
    def print_list(self):
        temp = self.head
        while(temp):
            print(temp.data)
            temp = temp.next

llist = LinkedList()
# llist.push(2)
# llist.push(1)
# llist.insert_after(llist.head.next, 3)
# llist.append(4)
# llist.print_list()
