class Solution4 {
    public boolean isIdealPermutation(int[] A) {
        int global=0;
        //int local=0;
        int n= A.length;
        
        for(int i=0; i<n-1; i++){
            
            for(int j=i+1; j<n; j++){
                if(i+1!=j && A[i]>A[j])
                    global++;
            }
            
            //if(A[i]>A[i+1])
            //    global--;
            
        }
        
        A=null;
        
        if(global==0)
            return true;
        return false;
        
    }
}
