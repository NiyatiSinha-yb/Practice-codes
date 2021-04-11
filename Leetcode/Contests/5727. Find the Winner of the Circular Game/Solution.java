import java.util.Arrays; 
class Solution {
    public int findTheWinner(int n, int k) {
        int start=1;
        int end=start+k;
        int outOfGame[]=new int[n-1];
        int freqOut=-1;
            
        while(freqOut!=n-1){
            end = (start+k)%n;
            
            for(int i=0; i<freqOut; i++){
                if(end==outOfGame[i])
                    end++;
            }
            //outOfGame[++freqOut]=end%n;
            if((end+1)/n>1)
                start=(end+1)%n;
            else
                start=end+1;
            
        }
        
        Arrays.sort(outOfGame);
        
        for(int i=1; i<=n-1; i++){
          
            if(outOfGame[i]!=i)
              return i;
            
              
        }
            
        return n;
            
                
        
        
    }
}
