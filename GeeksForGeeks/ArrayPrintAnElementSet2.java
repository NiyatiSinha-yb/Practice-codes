//C++ Array (print an element) | Set 2
//https://www.geeksforgeeks.org/problems/c-array-print-an-element-set-25933/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
#include <iostream>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    int findElementAtIndex(int a[], int n, int key) 
    {
        // Your code goes here
        return a[key];
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, key;
        cin >> n >> key;
        int a[n];
        for (int i = 0; i < n; i++) cin >> a[i];
        Solution ob;
        cout << ob.findElementAtIndex(a, n, key) << endl;
    }

    return 0;
}
// } Driver Code Ends
