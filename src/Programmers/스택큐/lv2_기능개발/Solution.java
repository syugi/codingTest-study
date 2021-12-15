package Programmers.스택큐.lv2_기능개발;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    코딩테스트연습 > 스택/큐 > 기능개발
    https://programmers.co.kr/learn/courses/30/lessons/42586

    프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
    또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
    이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
    먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
    각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 */
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i=progresses.length-1; i>=0; i--){
            int remain = 100-progresses[i];
            int workDay = remain/speeds[i];
            if(remain%speeds[i] > 0) workDay++;

            stack.add(workDay);
        }
        System.out.println("stack = " + stack);

        while(!stack.empty()){
            int cnt = 1;
            int num = stack.pop();
            while(!stack.empty() && stack.peek() <= num){
                stack.pop();
                cnt++;
            }
            answerList.add(cnt);
        }

        answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        System.out.println("answerList = " + answerList);

        return answer;
    }

    //다른사람 코드 참고
//    public int[] solution(int[] progresses, int[] speeds) {
//        int[] dayOfend = new int[100];
//        int day = -1;
//        for(int i=0; i<progresses.length; i++) {
//            while(progresses[i] + (day*speeds[i]) < 100) {
//                day++;
//            }
//            dayOfend[day]++;
//        }
//        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
//    }

}
