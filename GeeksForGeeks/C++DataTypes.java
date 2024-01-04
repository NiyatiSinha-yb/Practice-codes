//C++DataTypes.java
//https://www.geeksforgeeks.org/problems/c-data-types1523/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    int cppIntType() {
        int i;
        cin>>i;
        return i;
        // code here
    }
    
    char cppCharType() {
        // code here
        char i;
        cin>>i;
        return i;
    }
    
    float cppFloatType() {
        // code here
        float i;
        cin>>i;
        return i;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        Solution ob;
        cout << ob.cppIntType() << endl;
        cout << ob.cppCharType() << endl;
        cout << ob.cppFloatType() << endl;
    }
    return 0;
}
// } Driver Code Ends
