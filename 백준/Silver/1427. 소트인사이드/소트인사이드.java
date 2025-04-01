import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String number = sc.next();
        int[] A = new int[number.length()];
        
        for(int i = 0; i<number.length(); i++) {
            A[i] = Integer.parseInt(number.substring(i, i+1));
        }
        
        for(int i= 0; i<A.length; i++) {
            int max = i;
            for(int j = i+1; j<A.length; j++) {
                if(A[j] > A[max]) {
                    max = j;
                }
            }
            if(A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }
        
        for(int i = 0; i<A.length; i++) {
            System.out.print(A[i]);
        }
    }
}