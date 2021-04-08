import java.util.ArrayList;
public class check{

    public static void main(String args[]) //done using ArrayList
    {
        ArrayList<String> ob= new ArrayList<String>();
        int freq[]={0,0,0,0}; 
        ob.add("123"); //employee1 cusomers
        ob.add("230"); //employee2 customers
        ob.add("100"); // eployee3 customers
        ob.add("200");
        
        int maxCustomerfreq=2; //assuming 
        
        for( int i=0 ;i<ob.size(); i++ )
        {
            for( int j=0 ; j< (ob.get(i)).length(); j++)
            //System.out.println(Integer.parseInt(String.valueOf((ob.get(i)).charAt(j))));
            freq[Integer.parseInt(String.valueOf((ob.get(i)).charAt(j)))]++;
        }
        
        for( int i=0 ;i<freq.length; i++)
        {
            //System.out.println("Freq of cust "+i +" is =" + freq[i]);
            if(freq[i]>=maxCustomerfreq)
            {
                System.out.println("Freq of cust "+i +" is =" + freq[i]);
            }
        }
    }
    /*
    public static void main(String args[] ) //done using array
    {
        //ArrayList<ArrayList> ob= new ArrayList<>;
        int arr[][] ={{1,2,3},{2,3,0},{1,0,0},{2,0,0}};
        int cust[]={0,1,2,3};
        int freq[]={0,0,0,0};        
        int cus=3;
        
        for(int i=0; i<4; i++)
        {
            for( int j=0 ; j<3; j++)
            {
                //System.out.println(arr[i][j]+"***");
                freq[arr[i][j]]++;
            }
            
        }
        
        for( int i=0 ;i<freq.length; i++)
        {
            //System.out.println("Freq of cust "+i +" is =" + freq[i]);
            if(freq[i]>cus)
            {
                System.out.println("Freq of cust "+i +" is =" + freq[i]);
            }
        }
        
        
    }*/
}
