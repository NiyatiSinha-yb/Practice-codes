//5997. Find Three Consecutive Integers That Sum to a Given Number

class Solution {
    public long[] sumOfThree(long num) {
        long res[] =new long[3];
            
            if(num%3==0)
            {
                res[0]=num/3-1;
                res[1]=num/3;
                res[2]=num/3+1;
                return res;
            }
        
        return new long[0];
            
    }
}
