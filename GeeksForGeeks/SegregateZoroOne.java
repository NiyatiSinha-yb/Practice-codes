//User function Template for Java
/*
https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1/?category[]=Arrays&category[]=Arrays&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=D-E-Shaw&company[]=SAP%20Labs&company[]=Oracle&company[]=VMWare&company[]=Facebook&company[]=Cisco&company[]=Linkedin&company[]=PayPal&company[]=Apple&company[]=Twitter&company[]=DE%20Shaw&company[]=Informatica&company[]=Uber&company[]=MindFire%20Solutions&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=D-E-Shaw&company[]=SAP%20Labs&company[]=Oracle&company[]=VMWare&company[]=Facebook&company[]=Cisco&company[]=Linkedin&company[]=PayPal&company[]=Apple&company[]=Twitter&company[]=DE%20Shaw&company[]=Informatica&company[]=Uber&company[]=MindFire%20Solutions&problemStatus=unsolved&difficulty[]=0&difficulty[]=1&difficulty[]=2&page=1&query=category[]Arrayscompany[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Goldman%20Sachscompany[]Morgan%20Stanleycompany[]Walmartcompany[]D-E-Shawcompany[]SAP%20Labscompany[]Oraclecompany[]VMWarecompany[]Facebookcompany[]Ciscocompany[]Linkedincompany[]PayPalcompany[]Applecompany[]Twittercompany[]DE%20Shawcompany[]Informaticacompany[]Ubercompany[]MindFire%20SolutionsproblemStatusunsolveddifficulty[]0difficulty[]1difficulty[]2page1company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Goldman%20Sachscompany[]Morgan%20Stanleycompany[]Walmartcompany[]D-E-Shawcompany[]SAP%20Labscompany[]Oraclecompany[]VMWarecompany[]Facebookcompany[]Ciscocompany[]Linkedincompany[]PayPalcompany[]Applecompany[]Twittercompany[]DE%20Shawcompany[]Informaticacompany[]Ubercompany[]MindFire%20Solutionscategory[]Arrays
*/
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//in-place
//Initial Template for Java

import java.io.*;
import java.util.*;

public class SegregateZoroOne {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            new Solution().segregate0and1(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
/*
https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1/?category[]=Arrays&category[]=Arrays&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=D-E-Shaw&company[]=SAP%20Labs&company[]=Oracle&company[]=VMWare&company[]=Facebook&company[]=Cisco&company[]=Linkedin&company[]=PayPal&company[]=Apple&company[]=Twitter&company[]=DE%20Shaw&company[]=Informatica&company[]=Uber&company[]=MindFire%20Solutions&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=D-E-Shaw&company[]=SAP%20Labs&company[]=Oracle&company[]=VMWare&company[]=Facebook&company[]=Cisco&company[]=Linkedin&company[]=PayPal&company[]=Apple&company[]=Twitter&company[]=DE%20Shaw&company[]=Informatica&company[]=Uber&company[]=MindFire%20Solutions&problemStatus=unsolved&difficulty[]=0&difficulty[]=1&difficulty[]=2&page=1&query=category[]Arrayscompany[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Goldman%20Sachscompany[]Morgan%20Stanleycompany[]Walmartcompany[]D-E-Shawcompany[]SAP%20Labscompany[]Oraclecompany[]VMWarecompany[]Facebookcompany[]Ciscocompany[]Linkedincompany[]PayPalcompany[]Applecompany[]Twittercompany[]DE%20Shawcompany[]Informaticacompany[]Ubercompany[]MindFire%20SolutionsproblemStatusunsolveddifficulty[]0difficulty[]1difficulty[]2page1company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Goldman%20Sachscompany[]Morgan%20Stanleycompany[]Walmartcompany[]D-E-Shawcompany[]SAP%20Labscompany[]Oraclecompany[]VMWarecompany[]Facebookcompany[]Ciscocompany[]Linkedincompany[]PayPalcompany[]Applecompany[]Twittercompany[]DE%20Shawcompany[]Informaticacompany[]Ubercompany[]MindFire%20Solutionscategory[]Arrays
*/
class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        int travel=0,oneIndex=n;
        while(travel<oneIndex)
        {
            if(arr[travel]==1)
            {
                arr[travel]=arr[--oneIndex];
                arr[oneIndex]=1;
                
            }
            else
                travel++;
        }
        
    }
}
