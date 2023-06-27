//https://leetcode.com/problems/convert-the-temperature/
//2469. Convert the Temperature
//Time complexity: O(1)
//Space Complexity: O(1)

class Solution {
    public double[] convertTemperature(double celsius) {
        double arr[]=new double[2];
         //Temperature in Kelvin
        arr[0]= celsius+ 273.15;
        //Temperature in Fahrenheit 
        arr[1]= (celsius*1.80)+32.00;

        return arr;
    }
}
