//Time Complexity :O(a1.length)
//Space Complexity: O(1)
//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
//User function Template for Java


class ArraySubset {
    public String isSubset( long a1[], long a2[], long n, long m) {
        if(a1.length<a2.length)
            return "No";
        String strA1=",";
        for(int i=0; i<a1.length; i++)
            strA1=strA1+a1[i]+",";//comma added as seperator because if two elements like 1,12 are added to string 112 will also be accepted as string
        for(int i=0; i<a2.length; i++)
            if(!strA1.contains(","+a2[i]+","))
                return "No";
        return "Yes";
        
    }
}
