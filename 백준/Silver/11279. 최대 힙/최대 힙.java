import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int x;
        while(N > 0) {
            x = input.nextInt();
            if(x > 0) {
                pq.add(x);
            } else {
                if(!pq.isEmpty()) {
                    System.out.println(pq.poll());
                } else {
                    System.out.println("0");
                }
            }
            N--;
        }
    }
}