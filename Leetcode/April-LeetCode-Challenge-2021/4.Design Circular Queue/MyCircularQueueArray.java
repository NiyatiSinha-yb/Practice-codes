class MyCircularQueueArray {

    int arr[];
    int front;
    int rear;
    
    public MyCircularQueue(int k) {
        arr= new int[k];
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
         if(isFull()) {
             return false;
         }
        else{
            if(isEmpty())
            {
                front=0;
                //rear=0;
            }
            if(rear!=arr.length-1)
                arr[++rear]=value;
            
            else{
                rear=0;
                arr[rear]=value; 
            }
            return true;
        } 
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        else{
                 if(front==rear)//only one element in queue
                 {
                     front=-1;
                     rear=-1;
                 }
                 else if(front==arr.length-1)
                    front=0;

                 else
                    front++;
            return true;
        }
        
            
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        else
        {
            //System.out.println(arr[end]);
            return arr[front];
        }
        
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        else
            {
                return arr[rear];
            }
        
    }
    
    public boolean isEmpty() {
        if(front == -1 && rear==-1)
        {
            front=-1;
            rear=-1;
            return true;
        }
        else
            return false;
        
    }
    
    public boolean isFull() {
        if(rear+1==front || (rear==arr.length-1 && front==0))
            return true;
        else
            return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
