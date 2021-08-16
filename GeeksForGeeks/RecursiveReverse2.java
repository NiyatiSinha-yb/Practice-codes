//User function Template for Java


class Reverse
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
      
        return (reverseWord(str.substring(1)))+str.charAt(0);
        
    }
}
