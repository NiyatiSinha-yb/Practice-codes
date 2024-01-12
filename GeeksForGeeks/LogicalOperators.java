//Logical Operators
//https://www.geeksforgeeks.org/problems/logical-operators/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space Complexity: O(1)

//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

void logicOp(int a, int b);


// } Driver Code Ends
//User function Template for C++


void logicOp(int a, int b)
{
    /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/ 
    cout<<(a&&b)<<" "<<(a||b)<<" "<<((!a)&&(!b));
}

//{ Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int a,b;
	    cin>>a>>b;
	    logicOp(a,b);
	    
	}
	return 0;
}
// } Driver Code Ends
