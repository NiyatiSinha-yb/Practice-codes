class Solution4 {
    /*
    public void display(int[] a, int[] b){
        System.out.println("\n***************\n"); 
        
        for(int i=0; i<a.length;i++)
            System.out.print(a[i]+", ");
        System.out.println();
        for(int i=0; i<b.length;i++)
            System.out.print(b[i]+", ");
        
    }*/
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index1=0;
        
        //display(nums1,nums2);
        
        if(n!=0){
            for(int i=0; i<m;i++){
               // System.out.println("i="+i);
                if(nums1[index1]<=nums2[0]){ //element in nums1 is at correct position
                    index1++;
                }
                else{ //position of element in nums1 needs to be changed
                        
                        int temp=nums1[index1]; 
                        nums1[index1++]=nums2[0];
                        
                        if(n==1){
                            nums2[0]=temp;
                            //display(nums1,nums2); //***********
                        }
                        
                        else{
                            
                            for(int j=1;j<n;j++){
                                if(temp>nums2[j]){
                                    nums2[j-1]=nums2[j];
                                    //display(nums1,nums2);
                                }
                                    
                                    
                                 else{
                                    nums2[j-1]=temp;
                                    //display(nums1,nums2);
                                    break;
                                 }
                                if(j==n-1){
                                    nums2[n-1]=temp;
                                    //display(nums1,nums2);
                                }
                                
                            }
                        }    
                    }
                }
        
        //for(int i=0; i<n;i++)
          // System.out.println(temp);
        //System.out.println("hello");
            
            for(int i=m; i<m+n;i++)
                nums1[i]=nums2[i-m];
            //display(nums1,nums2);  //***********
        }
        
    }
}
