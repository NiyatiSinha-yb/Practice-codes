//Time Complexity :O(Math.max(a1.length, a2.length^2))
//Space Complexity: O(a1.length)
//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
//User function Template for Java


class ArraySubsetHashmap {
    public String isSubset( long a1[], long a2[], long n, long m) {
        if(a1.length<a2.length)
            return "No";
        HashSet<Long> ele=new HashSet<>();
        for(int i=0; i<a1.length; i++)
            ele.add(a1[i]);
        for(int i=0; i<a2.length; i++)
            if(!ele.contains(a2[i]))
                return "No";
        return "Yes";
        
    }
}
