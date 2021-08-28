//Time complexity: O(n)
//Space Complexity : O(1)
//https://www.youtube.com/watch?v=oaVa-9wmpns&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=3
//https://leetcode.com/problems/sort-colors/submissions/

class SortColor2 {
    public void sortColors(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int temp;
        while(high>=mid)
        {
            switch(arr[mid])
            {
                case 0: //swap arr[low] with arr[mid] , increase low and mid
                        temp=arr[low];
                        arr[low]=arr[mid];
                        arr[mid]=temp;
                        low++;
                        mid++;
                        break;
                
                case 1: //increase mid
                        mid++;
                        break;
                    
                case 2: //swap arr[mid] with arr[high], decrease high
                        temp=arr[high];
                        arr[high]=arr[mid];
                        arr[mid]=temp;
                        high--;
                        break;
            }
        }
    }
}
