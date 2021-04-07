class Solution {
    public boolean halvesAreAlike(String s) {
        String s2=s.substring(s.length()/2);
        s=s.substring(0,s.length()/2);
        
        //System.out.println(s+" , "+s2);
        int count=0;
        
        for(int i=0;i<s.length();i++){
            
            //System.out.println("***"+i);
            if("aeiouAEIOU".indexOf((s.charAt(i)))!=-1){
            
                //System.out.println(s.charAt(i)+","+count);
                count++;
            }
            
            if("aeiouAEIOU".indexOf((s2.charAt(i)))!=-1){
            
                //System.out.println(s.charAt(i)+","+count);
                count--;
            }
            
        }
        
        if(count==0)
            return true;
        return false;
        
        
    }
}

/*
Your runtime beats 93.36 % of java submissions.
You are here!
Your memory usage beats 98.63 % of java submissions.

*/
