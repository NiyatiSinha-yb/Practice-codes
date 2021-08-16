//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
          String rev="";
       
        // Reverse the string str
         for(int i=0; i<str.length(); i++)
        {
            rev=str.charAt(i)+rev;
        }
        
        return rev;
        
    }
}
