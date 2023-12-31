//https://www.geeksforgeeks.org/problems/check-for-binary/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Check for Binary
//Time Complexity: O(log N)
//Space complexity: O(1)


//{ Driver Code Starts
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


// } Driver Code Ends


class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  for(int i=0; i<str.length(); i++)
	  {
	      if(str.charAt(i)!='0' && str.charAt(i)!='1')
	      {
	        return false;
	      }
	  }
	  return true;
	}
}
