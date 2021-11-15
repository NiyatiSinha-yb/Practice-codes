//412. Fizz Buzz
//https://leetcode.com/problems/fizz-buzz/
//Time Complexity: O(n)
//Spcae complexity: O(1)

class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> ls= new ArrayList<String>();
        String res="";
        for( int i=1; i<=n; i++)
        {
            res="";
            if(i%15==0)
            {
                 ls.add("FizzBuzz");
            }
            else if(i%5==0)
            {
                ls.add("Buzz");
            }
            else if(i%3==0)
            {
                ls.add("Fizz");
            }
            else
                ls.add(""+i);
        }
        return ls;
    }
}
