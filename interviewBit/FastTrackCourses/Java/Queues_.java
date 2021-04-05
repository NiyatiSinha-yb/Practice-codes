import java.lang.*;
import java.util.*;

public class Queues_ {
    static ArrayList<Integer> ob=new ArrayList<Integer>();
    static Scanner sc = new Scanner(System.in);
    static boolean add(){
        ob.add(Integer.parseInt(sc.next()));
        return true;
    }
    static int peek()
    {
        int falseCase= sc.nextInt();
        if(ob.size()==0)
            return falseCase;
        return(ob.get(0));
    }
    static void remove()
    {
        int falseCase= sc.nextInt();
        if(ob.size()!=0)
            ob.remove(0);
      
    }
    public static void main(String[] args) {
        
         
        int len= sc.nextInt();
        for(int i=0; i<len;i++){
            switch(sc.nextInt()){
                case 1: add();
                        break;
                case 2: System.out.println(peek());
                        break;
                case 3: remove();
                        break;
                            
            }
        }
        sc.close();
    }
}
