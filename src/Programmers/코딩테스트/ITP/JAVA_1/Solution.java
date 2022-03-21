package Programmers.코딩테스트.ITP.JAVA_1;

import java.util.Stack;

class Solution {

    public int[] solution(int[] price) {
        int[] answer = new int[price.length];

        Stack<Integer> idxStack = new Stack<>();

        idxStack.push(0);
        for(int i=1; i<price.length; i++){
            while(!idxStack.empty() && price[i] > price[idxStack.peek()]){
                int idx = idxStack.pop();
                answer[idx] = i - idx;
            }
            idxStack.push(i);
        }
        while (!idxStack.empty()){
            int idx = idxStack.pop();
            answer[idx] = -1;
        }

        return answer;
    }

}
