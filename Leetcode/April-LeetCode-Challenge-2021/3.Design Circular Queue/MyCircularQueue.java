class MyCircularQueue {

    ArrayList<Integer> ob;
    int limit;
    public MyCircularQueue(int k) {
        ob= new ArrayList<Integer>(k);
        limit=k;
    }
    
    public boolean enQueue(int value) {
         if(!isFull()) {
             ob.add(value);
             return true;
         }
        else
            return false;
        
    }
    
    public boolean deQueue() {
        if(!isEmpty())
        {
            ob.remove(0);
            return true;
        }
        else
            return false;
    }
    
    public int Front() {
        if(ob.size()==0)
            return -1;
        else
        {
            System.out.println(ob.get(0));
            return ob.get(0);
        }
        
    }
    
    public int Rear() {
        if(ob.size()==0)
            return -1;
        else
            {
            System.out.println(ob.get(ob.size()-1));
            return ob.get(ob.size()-1);
            }
        
    }
    
    public boolean isEmpty() {
        if(ob.size()==0)
            return true;
        else
            return false;
        
    }
    
    public boolean isFull() {
        if(ob.size()==limit)
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
