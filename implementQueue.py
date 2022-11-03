class MyQueue(object):

    def __init__(self):
        self.stack = []

    def push(self, x):
        print(self.stack)
        self.stack.append(x)

    def pop(self):
       popped = self.stack.remove(self.stack[0])
       return popped
        
    def peek(self):
        return self.stack[0]
        

    def empty(self):
        if len(self.stack) == 0:
            return True
        else:
            return False


obj = MyQueue()
obj.push(5)
param_2 = obj.pop() 
param_3 = obj.peek()
param_4 = obj.empty()