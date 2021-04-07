class Solution2 {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String s2=s.substring(s.length()/2);
        s=s.substring(0,s.length()/2);
        
        //System.out.println(s+" , "+s2);
        int count=0;
        
        for(int i=0;i<s.length();i++){
            
            //System.out.println("***"+i);
            if("aeiou".indexOf((s.charAt(i)))!=-1){
            
                //System.out.println(s.charAt(i)+","+count);
                count++;
            }
            
            if("aeiou".indexOf((s2.charAt(i)))!=-1){
            
                //System.out.println(s.charAt(i)+","+count);
                count--;
            }
            
        }
        
        if(count==0)
            return true;
        return false;
        
        
    }
}

/*Your memory usage beats 76.48 % of java submissions
Your runtime beats 68.28 % of java submissions.

*/
