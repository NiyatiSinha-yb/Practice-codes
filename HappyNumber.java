//202. Happy Number
//https://leetcode.com/problems/happy-number/
//Time Complexity: O()
//Space complexity: O()

//Doubt regarding the time and space complexity calculation

class Solution {
    public boolean isHappy(int n) {
      
        ArrayList <Long> numbers=new ArrayList<>();
        if(n<=0)
            return false;
        
        long val=n; 
        
        while(true)
        {
            val=checkHappy(val);
              
            if(val==1)
              return true;
            else if(numbers.contains(val))
              return false;
            else
            {
               numbers.add(val);
            }
          
        }
        
    }
    public long checkHappy(long n)
    {
       
            long copy=n;
            long squareOfDigits=0;
            while(copy!=0)
            {
                long digit=copy%10;
                copy/=10;
                squareOfDigits+=digit*digit;
            }
            return squareOfDigits;
        
    }
}
