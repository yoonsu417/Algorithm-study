import java.util.HashSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        HashSet<Integer> lostSet = new HashSet<>();
        HashSet<Integer> reserveSet = new HashSet<>();
        
        for(int i : reserve) {
            reserveSet.add(i);
        }
        for(int i : lost) {
            if(reserveSet.contains(i))
                reserveSet.remove(i);
            else
                lostSet.add(i);
        }
        
        for(int i : reserveSet) {
            if(lostSet.contains(i-1)) {
                lostSet.remove(i-1);
            } else if(lostSet.contains(i+1)) {
                lostSet.remove(i+1);
            }
        }
        
        return n - lostSet.size();
    }
}