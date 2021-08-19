//User function Template for Java
//Time Complexity: O(length of string)
//Space Complexity: O(length of string)
//https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1#
//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

class RemDuplicate {
    String removeDuplicates(String str) {
        // code here
        String output="";
        int arr[]=new int[str.length()];
        for(int i=0; i<str.length();i++)
        {
            arr[str.indexOf(str.charAt(i))]++;
        }
        /*for(int i=0; i<str.length();i++)
        {
            System.out.println(arr[i]);
        }*/
        for(int i=0; i<str.length();i++)
        {
            if(arr[i]>0)
            {
                output+=(str.charAt(i));
            }
        }
        return output;
    }
}
