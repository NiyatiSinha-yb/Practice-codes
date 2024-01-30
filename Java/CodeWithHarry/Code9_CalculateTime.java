// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of final velocity v");
        int v = sc.nextInt();
        System.out.println("Enter value of initial velocity u");
        int u = sc.nextInt(); 
        System.out.println("Enter value of acceleration a");
        int a = sc.nextInt();
        System.out.println("Enter value of displacement s");
        int s = sc.nextInt(); 
        System.out.println("(v^2-u^2)/(2*a*s) = "+(v*v-u*u)/(2.f*a*s) );
       
    }
}
