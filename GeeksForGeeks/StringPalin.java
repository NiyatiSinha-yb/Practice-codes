//User function Template for Java
//Time Complexity: O(S.length)
//Space Complexity: O(1)
//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1#
class StringPalin {
    int isPlaindrome(String S) {
        String back="";
        for(int i=S.length()-1, k=0; k<S.length()/2;k++)
        {
            back=back+S.charAt(i-k);
        }
        //System.out.println(back);
        //System.out.println(S.substring(0,S.length()/2));
        return(((S.substring(0,S.length()/2)).equals(back))?1:0);
    }
}
