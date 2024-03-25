package Programmers.연습.lv0_옹알이;

/**
 * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
 * 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] pronArr = {"aya", "ye", "woo", "ma"};
        String str = "";
        for (String bab : babbling) {
            str = bab;
            for (String pron : pronArr) {
                str = str.replace(pron, "#");
            }
            str = str.replace("#", "");
            if (str.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}
