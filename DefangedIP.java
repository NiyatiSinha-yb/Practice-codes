//Time Complexity: O(String length)
//Space Complexity: O(1)
//https://leetcode.com/problems/defanging-an-ip-address/

class DefangedIP {
    public String defangIPaddr(String address) {
        String defangedIP="";
        for(int i=0; i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                defangedIP+="[.]";
            }
            else
                defangedIP+=address.charAt(i);
        }
        return defangedIP;
    }
}
