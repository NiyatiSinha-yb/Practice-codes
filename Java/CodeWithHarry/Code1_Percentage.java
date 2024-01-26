// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Code1_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        double sum=0;
        for(int i=0; i<5; i++)
        {
            System.out.println("Input marks of subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        double percentage= 1.0*sum/marks.length;
        System.out.println("Total score is "+sum+"/500");
        System.out.println("Percentage of this student is "+percentage+"%");
        
    }
}
