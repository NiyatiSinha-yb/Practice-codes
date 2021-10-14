//Time Complexity: O(n log n)
//Spcae Complexity : O(n)
//https://leetcode.com/problems/design-hashset/submissions/
//705. Design HashSet

class MyHashSet {
ArrayList<Integer> ob= new ArrayList<>(); 
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!ob.contains(key))
            ob.add(key);
    }
    
    public void remove(int key) {
        if(ob.contains(key))
            ob.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return ob.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
