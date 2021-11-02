import java.util.Base64;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
//import org.apache.commons.codec.binary.Base64;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        String pass[]=new String[5];
        String name="";
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5;)
        {
            if(sc.hasNextLine())
                name = sc.nextLine();
            else
                break;
            if(!(name.length()<=12 && name.length()>=10))
            {
                continue;
            }
           // System.out.println(i+" Length Passed");

            if(!(name.contains("#")||name.contains("$")||name.contains("@")||name.contains("!")||name.contains("%")||name.contains("&")||name.contains("*")||name.contains("?")))
            {
                continue;
            }

          //  System.out.println(i+" Contains atleast one special character");
            if(!(name.contains("0")||name.contains("1")||name.contains("2")||name.contains("3")||name.contains("4")||name.contains("5")||name.contains("6")||name.contains("7")||name.contains("8")||name.contains("9")))
            {
                continue;
            }
           // System.out.println(i+" Contains atleast one number");

            int flag=0;
            for(int k=65; k<=90; k++)
            {
                String c= ""+(char)k;
                if(name.indexOf(c)>=0 && name.indexOf(c)<name.length()-1)
                {
                    if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(""+name.charAt(name.indexOf(c)+1)))
                    {
                        flag=1;
                    }
                }
            }
            if(flag==0)
                continue;

           // System.out.println(i+" Contains consecutive capital");

            for(int k=97; k<=122; k++)
            {
                String c= ""+(char)k;
                if(name.indexOf(c)>=0 && name.indexOf(c)<name.length()-1)
                {
                    if("abcdefghijklmnopqrstuvwxyz".contains(""+name.charAt(name.indexOf(c)+1)))
                    {
                        flag=2;
                    }
                }
            }
            if(flag==1)
                continue;

           // System.out.println(i+" Contains consecutive lower");    

            pass[i]=Base64.getEncoder().encodeToString(name.getBytes());
            System.out.println("Encoded password for system-"+((char)(i+97)+"").toLowerCase()+": "+pass[i]);
            i++;
        }

        
        while(sc.hasNextLine())
        {
            
            name = sc.nextLine();
            
            if((int)name.charAt(name.length()-1)>=97 && (int)name.charAt(name.length()-1)<=101)
            {
                byte[] actual= Base64.getDecoder().decode(pass[(int)name.charAt(name.length()-1)-97]);
                //String decode=new String(Base64.getDecoder().decode(name));
                String decode=new String(actual);
                System.out.println("Reading Security Password for "+name+"....."+decode);
            }
        }

    }
}
