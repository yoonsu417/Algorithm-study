import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < progresses.length; i++) {
            double days = (100 - progresses[i]) / (double) speeds[i];
            int daysUp = (int) Math.ceil(days);

            int j = i + 1;
            for (; j < progresses.length; j++)
                if (progresses[j] + daysUp * speeds[j] < 100)
                    break;

            answer.add(j - i);
            i = j - 1;
        }
        
        int[] answerArray = new int[answer.size()];
        
        for(int i = 0; i<answer.size(); i++) {
            answerArray[i] = answer.get(i);
        }
        
        return answerArray;
    }
}