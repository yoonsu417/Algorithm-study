import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        while(N > 0) {
            int x = input.nextInt();
            
            if(x == 0) {
               if(!pq.isEmpty()) {
                   System.out.println(pq.poll());
                } else {
                   System.out.println("0");
               }         
            } else {
                pq.add(x);
            }
           N--;
        }
       
    }
}