//Time Complexity: O(n)
//Spcae Complexity: O(1)
//412. Fizz Buzz
//https://leetcode.com/problems/fizz-buzz/

class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> ls= new ArrayList<String>();
        String res="";
        for( int i=1; i<=n; i++)
        {
            res="";
            if(i%3==0)
            {
                 res+="Fizz";
            }
            if(i%5==0)
            {
                res+="Buzz";
            }
            if(res=="")
            {
                res+=i;
            }
            ls.add(res);
        }
        return ls;
    }
}
