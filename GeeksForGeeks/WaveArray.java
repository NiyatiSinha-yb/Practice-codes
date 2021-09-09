class Solution{
    //https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1/?category[]=Arrays&category[]=Arrays&problemStatus=unsolved&difficulty[]=0&difficulty[]=1&difficulty[]=2&page=1&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=D-E-Shaw&company[]=SAP%20Labs&company[]=Oracle&company[]=VMWare&company[]=Facebook&company[]=Cisco&company[]=Linkedin&company[]=PayPal&company[]=Apple&company[]=Twitter&company[]=DE%20Shaw&company[]=Informatica&company[]=Uber&company[]=MindFire%20Solutions&query=category[]ArraysproblemStatusunsolveddifficulty[]0difficulty[]1difficulty[]2page1company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Goldman%20Sachscompany[]Morgan%20Stanleycompany[]Walmartcompany[]D-E-Shawcompany[]SAP%20Labscompany[]Oraclecompany[]VMWarecompany[]Facebookcompany[]Ciscocompany[]Linkedincompany[]PayPalcompany[]Applecompany[]Twittercompany[]DE%20Shawcompany[]Informaticacompany[]Ubercompany[]MindFire%20Solutionscategory[]Arrays#
    // Time Complexity: O(n/2).
    //Auxiliary Space: O(1).
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        for(int i=0; i<n-1; i=i+2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
    }
    
}
