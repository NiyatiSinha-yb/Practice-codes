// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[3];
        double sum=0;
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Input marks of subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        System.out.println("Total score is "+sum);
        
    }
}
