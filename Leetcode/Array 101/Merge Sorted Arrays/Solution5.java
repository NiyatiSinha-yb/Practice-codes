class Solution5 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        if(m==0){
            for(int i=0; i<n;i++)
                nums1[i]=nums2[i];
            return;
        }
        
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
            
        while(p1!=-1 && p2!=-1){
            if(nums1[p1]>=nums2[p2])
                nums1[p--]=nums1[p1--];
            else
                nums1[p--]=nums2[p2--];
        }
        
        if(p2!=-1){
            while(p!=-1)
                nums1[p--]=nums2[p2--];
        
        }
    }
}
