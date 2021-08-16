
//User function Template for Java


class RecursiveReverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
          
       
        // Reverse the string str
        if(str.length()==1)
        {
           return str;
        }
      
        return str.charAt(str.length()-1)+(reverseWord(str.substring(0,str.length()-1)));
        
    }
}
