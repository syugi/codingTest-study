package Programmers.힙.lv3_이중우선순위큐;

import java.util.Collections;
import java.util.PriorityQueue;

/*
    코딩테스트연습 > 힙(Heap) > 이중우선순위큐
    https://programmers.co.kr/learn/courses/30/lessons/42628

    이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말합니다.

    명령어	수신 탑(높이)
    I 숫자	큐에 주어진 숫자를 삽입합니다.
    D 1	    큐에서 최댓값을 삭제합니다.
    D -1	큐에서 최솟값을 삭제합니다.
    이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때,
    모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 solution 함수를 구현해주세요.
 */
class Solution {

    public int[] solution(String[] operations) {
        int[] answer = {0, 0};

        PriorityQueue<Integer> ascPq = new PriorityQueue<>();
        PriorityQueue<Integer> descPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            String[] temp = op.split(" ");
            int num = Integer.parseInt(temp[1]);
            switch (temp[0]) {
                case "I" :
                    ascPq.add(num);
                    descPq.add(num);
                    break;
                case "D":
                    if(ascPq.size() > 0){
                        if(num == 1){
                            int max = descPq.poll();
                            ascPq.remove(max);
                        }else {
                            int min = ascPq.poll();
                            descPq.remove(min);
                        }
                    }
                    break;
            }
        }

        if(!ascPq.isEmpty()){
            int max = descPq.peek();
            int min = ascPq.peek();
            answer = new int[]{max, min};
        }
        //Arrays.stream(answer).forEach((i) -> System.out.print(i+", "));
        //System.out.println("");

        return answer;
    }

}
