//Time Complexity: O(n)
//Space Complecity: O(1)
//https://leetcode.com/problems/defanging-an-ip-address/submissions/
class DefangedIP2 {
    public String defangIPaddr(String address) {
        StringBuilder defangedIP=new StringBuilder();
        for(int i=0; i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                defangedIP.append("[.]");
            }
            else
                defangedIP.append(address.charAt(i));
        }
        return defangedIP.toString();
    }
}
