//Small Factorial
//https://www.geeksforgeeks.org/problems/small-factorial0854/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(1)
//Space complexity: O(N)

//{ Driver Code Starts


#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
	public:
		long long int find_fact(int n)
		{
		    // Code here.
		    long long int fact=1;
		    for(int i=1; i<=n; i++)
		    {
		        fact*=i;
		    }
		    return fact;
		}
};

//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n; 
    	cin >> n;
    	Solution ob;
    	long long int ans = ob.find_fact(n);
    	cout << ans <<"\n";
    }
	return 0;
}
// } Driver Code Ends
