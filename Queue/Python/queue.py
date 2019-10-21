class Queue:
  def __init__(self, size):
    self.size = size
    self.queue = []
  
  def is_empty(self):
    return self.queue == []

  def enqueue(self, data):
    if self.size == self.get_size:
      raise Exception('Can\'t add anymore data, Queue is full')
    self.queue.append(data)

  def dequeue(self):
    if self.is_empty:
      raise Exception('Can\'t delete anymore data, Queue is empty')
    data = self.queue[0]
    del self.queue[0]
    return data
  
  def get_front(self):
    if self.is_empty:
      raise Exception('Queue is empty')
    return self.queue[-1]

  def get_back(self):
    if self.is_empty:
      raise Exception('Queue is empty')
    return self.queue[0]

  def get_size(self):
    return len(self.queue)
