//Find Number of Numbers
//https://www.geeksforgeeks.org/problems/find-number-of-numbers/1?page=1&status=unsolved,attempted&sortBy=difficulty
//Time Complexity: O(n*k) -> k is the maximum number of digits in an element of the array
//Space complexity: O(1)

//{ Driver Code Starts
import java.util.*;
class Numbers{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		GfG g=new GfG();
		System.out.println(g.num(a,n,k));
	}
}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
          static int countK(int n, int k)
          {
              int copy=n;
              int rem=0;
              int count=0;
              while(copy!=0)
              {
                  rem=copy%10;
                  copy=copy/10;
                  if(rem==k)
                  {
                      count++;
                  }
              }
              return count;
          }
          
          public static int num(int a[], int n, int k)
            {
                 //Your code here
                 int sum=0;
                 for(int i=0; i<n; i++)
                 {
                     sum+=countK(a[i],k);
                 }
                 return sum;
                 
            }
}
