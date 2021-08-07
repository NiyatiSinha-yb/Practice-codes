class Solution {
    public void duplicateZeros(int[] arr) 
    {
        
        for(int i=0; i< arr.length-1; i++)
        {
            if(arr[i]==0)
            {
                for(int j=arr.length-1; j>i; j--)
                {
                        arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i++;
            }
        }
         for(int i=0; i< arr.length; i++)
         {
             System.out.println(arr[i]);
         }
       /* 
        for(int i=0;i<arr.length; i++)
        {
           if(arr[i]==0 && i!=arr.length-1)// i is the index where zero is found
           {
               int j=arr.length-1;
               while(j!=i+1)
               {
                   arr[j]=arr[j-1];
                   j--;
               }
               arr[i+1]=0;
               i++;
           }
           
        }*/
        
    }
}
