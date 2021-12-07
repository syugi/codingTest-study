package Programmers.해시.lv1_완주하지_못한_선수;

import java.util.HashMap;

/*
    코딩테스트연습 > 해시 > 완주하지 못한 선수
    https://programmers.co.kr/learn/courses/30/lessons/42576

    수많은 마라톤 선수들이 마라톤에 참여하였습니다.
    단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (String m : map.keySet()) {

            if (map.get(m) != 0) {
                answer = m;
            }
        }
        return answer;
    }
}
