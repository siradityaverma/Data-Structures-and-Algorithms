class Stack:
  def __init__(self, size):
    self.size = size
    self.stack = []

  def is_empty(self):
    return self.stack == []
  
  def push(self, data):
    if self.size == self.get_size:
      raise Exception('Stack Overflow: Can\'t Add More Data')
    self.stackp.append(data)

  def pop(self):
    if self.is_empty:
      raise Exception('Stack Underflow: Cant\'t Delete Anymore')
    data = self.stack[-1]
    del self.stack[-1]
    return data

  def peek(self):
    if self.is_empty:
      raise Exception('Stack is Empty')
    return self.stack[-1]

  def get_size(self):
    return len(self.stack)