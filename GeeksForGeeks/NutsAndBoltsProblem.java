
//User function Template for Java
/*https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1/?category[]=Arrays&category[]=Arrays&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=D-E-Shaw&company[]=SAP%20Labs&company[]=Oracle&company[]=VMWare&company[]=Facebook&company[]=Cisco&company[]=Linkedin&company[]=PayPal&company[]=Apple&company[]=Twitter&company[]=DE%20Shaw&company[]=Informatica&company[]=Uber&company[]=MindFire%20Solutions&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Adobe&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=Walmart&company[]=D-E-Shaw&company[]=SAP%20Labs&company[]=Oracle&company[]=VMWare&company[]=Facebook&company[]=Cisco&company[]=Linkedin&company[]=PayPal&company[]=Apple&company[]=Twitter&company[]=DE%20Shaw&company[]=Informatica&company[]=Uber&company[]=MindFire%20Solutions&problemStatus=unsolved&difficulty[]=0&difficulty[]=1&difficulty[]=2&page=1&query=category[]Arrayscompany[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Goldman%20Sachscompany[]Morgan%20Stanleycompany[]Walmartcompany[]D-E-Shawcompany[]SAP%20Labscompany[]Oraclecompany[]VMWarecompany[]Facebookcompany[]Ciscocompany[]Linkedincompany[]PayPalcompany[]Applecompany[]Twittercompany[]DE%20Shawcompany[]Informaticacompany[]Ubercompany[]MindFire%20SolutionsproblemStatusunsolveddifficulty[]0difficulty[]1difficulty[]2page1company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Adobecompany[]Goldman%20Sachscompany[]Morgan%20Stanleycompany[]Walmartcompany[]D-E-Shawcompany[]SAP%20Labscompany[]Oraclecompany[]VMWarecompany[]Facebookcompany[]Ciscocompany[]Linkedincompany[]PayPalcompany[]Applecompany[]Twittercompany[]DE%20Shawcompany[]Informaticacompany[]Ubercompany[]MindFire%20Solutionscategory[]Arrays#
*/

//Initial Template for Java



import java.util.*;
import java.io.*;

public class NutsAndBoltsProblem {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        char size[]={'!','#','$','%','&','*','@','^','~'};
        HashMap <Character, Integer> ob =new HashMap <Character, Integer>();
        for(int i=0;i<n; i++)
        {
            ob.put(Character.valueOf(nuts[i]),0);
        }
        int j=0;
        for (int i=0;i<size.length;i++) 
        {
            if(ob.containsKey(size[i]))
            {
                nuts[j]=size[i];
                bolts[j++]=size[i];
            }
        }
        
        
    }
}
