import java.lang.*;
import java.util.*;

public class Queue_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        sc.nextLine();
        Queue < Integer > q = new ArrayDeque < > ();
        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            if (x == 1)
                q.offer(y);
            else if (x == 2) {
                if (q.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(q.peek());

            } else {
                if (q.size() == 0)
                    continue;
                else
                    q.poll();
            }
        }
        sc.close();
    }
}
