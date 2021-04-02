class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        
        int max=0;
        for(int i=0; i<(1<<strs.length) ;i++){ // a<<b means in binary shft where we shift the binarry bits of a to b bits right adding 0's in the end 
            
   //    **********************IMPORTANT*********************  
            
   //         1 -> binary =  0001   =                 0*2^1 + 1*2^0   =   1*2^0
   //      1<<3 -> binary =  1000   = 1*2^3 + 0*2^2 + 0*2^1 + 0*2^0   =   1*2^3
            
    //thus basically 1<<a means 2^a in binary system i.e. only a-th bit as 1
    // if we were using octal system it would have been 8^a and so on
            
            String completeSubString = "";
            int count=0;
            
            for( int j=0; j<strs.length ;j++)
            {
                if( ( i & (1<<j)) > 0 ) // a & b ->convert a & b to binary and perform 'AND' operation on binary digits i.e. T&T=T T&F=F F&T=F F&F=F
                {
                    //System.out.print(strs[j]+",");
                    completeSubString +=strs[j];
                    count++;
                }
                
            }
            //System.out.println();
            
            
            int totalLength = completeSubString.length();
            
            if(completeSubString.length()-(completeSubString.replace("1","")).length()<=n)
            {
                //copy=str;
                if(completeSubString.length()-(completeSubString.replace("0","")).length()<=m)
                {
                    if(count>max)
                    max=count;
                }
            }
            
            //System.out.println(completeSubString);
            
                
        }
        return max;
    }
    
       
}
