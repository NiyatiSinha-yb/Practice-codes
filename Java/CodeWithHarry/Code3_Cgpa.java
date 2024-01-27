// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Marks are out of 100
        int marks[]=new int[3];
        double sum=0;
        double cgpa;
        double avg;
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Input marks of subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        System.out.println("Total score is "+sum+"/300");
        avg=sum/3;
        System.out.println("Avg score is "+avg);
        cgpa=avg/10; //as avg is out of 100 and CGPA is out of 10
        System.out.println("CGPA is "+cgpa);
        
    }
}
