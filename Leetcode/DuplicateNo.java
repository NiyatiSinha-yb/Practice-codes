//https://leetcode.com/problems/find-the-duplicate-number/submissions/
class DuplicateNo {
    public int findDuplicate(int[] arr) {
        
        Arrays.sort(arr);
        for(int i=0; i<arr.length/2; i++)
        {
            if(arr[i]==arr[i+1])
                return arr[i];
            if(arr[(arr.length-1)-i]==arr[(arr.length-1)-i-1])
                return arr[arr.length-1-i];
        }
        return 1;
    }
}
