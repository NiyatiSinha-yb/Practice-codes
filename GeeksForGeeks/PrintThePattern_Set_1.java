//Print the pattern | Set-1
//https://www.geeksforgeeks.org/problems/print-the-pattern-set-1/1?page=1&difficulty=School&sortBy=submissions
//Time complexity: O(N log n)
//Space complexity: O(1)

//{ Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
         // Your code here
         int copy=n;
         while(copy>0)
         {
             for (int i=n; i>0; i--)
             {
                 int c=i;
                 for (int p=0; p<copy; p++)
                 {
                     System.out.print(i+" ");
                 }
             }
             copy--;
             System.out.print("$");
         }
    }
}
