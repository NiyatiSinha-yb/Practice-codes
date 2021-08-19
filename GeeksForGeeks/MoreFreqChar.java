//Time complexity: O(str.length())
//Space complexity: O(str.length())
//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
class MoreFreqChar {
    void removeDuplicates(String str) {
        // code here
        String output="";
        int arr[]=new int[str.length()];
        for(int i=0; i<str.length();i++)
        {
            arr[str.indexOf(str.charAt(i))]++;
        }
        for(int i=0; i<str.length();i++)
        {
            if(arr[i]>1)
            {
                System.out.println(str.charAt(i)+", count="+arr[i]);
            }
            
        }
    }
}
