class Solution {
    public boolean isIdealPermutation(int[] A) {
        int global=0,local=0;
        int n= A.length;
        
        for(int i=0; i<n-1; i++){
            
            for(int j=i+1; j<n; j++){
                if(A[i]>A[j])
                    global++;
            }
            
            if(A[i]>A[i+1])
                local++;
            
        }
        
        if(local==global)
            return true;
        return false;
        
    }
}
