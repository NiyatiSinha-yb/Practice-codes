
import java.util.Scanner; 

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        // the issue while using Strings in Scanner is that in any place if use other 
        //than sc.nextLine() and sc.next()
        //i.e. if at any place we used sc.nextInt() then after scanning the curson scans and stays on the same line and now when we use sc.nextLine() or sc.next() then the cursor reads whatever was on the same line after the cursor position (in such case it will take one string after such a situation as empty string) leaving the change line and moves to next line
        int n = Integer.parseInt(sc.nextLine());
        String name="";
        for(int i=0; i<n; i++)
        {
            name = sc.nextLine(); 
            
            if((name.indexOf('a')!=-1 && name.indexOf('e')!=-1 && name.indexOf('i')!=-1 && name.indexOf('o')!=-1 && name.indexOf('u')!=-1) || (name.indexOf('A')!=-1 && name.indexOf('E')!=-1 && name.indexOf('I')!=-1 && name.indexOf('O')!=-1 && name.indexOf('U')!=-1))
                System.out.println("lovely string");
            else
                System.out.println("ugly string");
        }
            
        
        
    }
}
