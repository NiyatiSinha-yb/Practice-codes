//Palindromic Array
//https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty=School&sortBy=submissions
//Time Complexity: O(n)
//Space Complexity: O(n)

//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static int checkPalindrome(int p)
    {
        int copy=p;
        int rem=0;
        int num=0;
        while(copy>0)
        {
            rem=copy%10;
            copy=copy/10;
            num=num*10+rem;
        }
        if(num==p)
            return 1;
        return 0;
    }
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0; i<n; i++)
                  {
                      if(checkPalindrome(a[i])!=1)
                        return 0;
                  }
                  return 1;
           }
}
