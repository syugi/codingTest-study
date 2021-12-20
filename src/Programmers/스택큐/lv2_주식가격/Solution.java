package Programmers.스택큐.lv2_주식가격;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    코딩테스트연습 > 스택/큐 > 주식가격
    https://programmers.co.kr/learn/courses/30/lessons/42584

    초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
    가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 */
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            for(int j = i+1; j<prices.length;j++){
                answer[i]++;
                if(prices[i] > prices[j]){
                    break;
                }
            }
        }

        return answer;
    }
}
