//https://leetcode.com/problems/design-browser-history/submissions/
//1472. Design Browser History
//Time Complexity:O(n)
//Space Complexity: O(n)

class BrowserHistory {
    ArrayList <String>  ob= new ArrayList<>();
    int countIndex=-1;
    int pointerIndex=-1;
    public BrowserHistory(String homepage) {
        ob.add(homepage);
        countIndex++;
        pointerIndex++;
    }
    
    public void visit(String url) {
        pointerIndex++;
        countIndex=pointerIndex;
        ob.add(pointerIndex,url);
    }
    
    public String back(int steps) {
      
        if(pointerIndex-steps<0){
             /*
            // System.out.println("# "+ob.toArray());
            Object[] objects = ob.toArray();
  
            // Printing array of objects
            for (Object obj : objects)
                System.out.print(obj + " ");
            
            //System.out.println("*back* "+ob.get(pointerIndex));
            */
            pointerIndex=0;
            return ob.get(0);
        }
         pointerIndex=pointerIndex-steps;
        //System.out.println(ob.get(pointerIndex));
        //System.out.println("count= "+countIndex+" , pointer= "+pointerIndex);
        return ob.get(pointerIndex);

    }
    
    public String forward(int steps) {
        
        if(pointerIndex+steps>countIndex){
           /* 
           // System.out.println("# "+ob.toArray());
            Object[] objects = ob.toArray();
  
            // Printing array of objects
            for (Object obj : objects)
                System.out.print(obj + " ");
            
            
            System.out.println();
            */
            pointerIndex=countIndex;
           // System.out.println("*forward* "+ob.get(countIndex)+", "+countIndex);
            
            return ob.get(pointerIndex);
        }
        pointerIndex=pointerIndex+steps;
        return ob.get(pointerIndex);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
