
//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */
//https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays#
// Time Complexity: O(N)
//Auxiliary Space: O(1)

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        pair ob= new pair(Long.MAX_VALUE,Long.MIN_VALUE);
       // System.out.println(ob.first);
       //arrays can have index range withing the range of integers only
        for(int i=0; i< n; i++)
        {
            if(ob.first>a[i])
            {
                ob.first=a[i];
            }
            if(ob.second<a[i])
            {
                ob.second=a[i];
            }
        }
        return ob;
    }
}
