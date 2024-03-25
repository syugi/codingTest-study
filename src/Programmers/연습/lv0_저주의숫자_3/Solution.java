package Programmers.연습.lv0_저주의숫자_3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;

        List<Integer> threeNums = new ArrayList<>();

        while(threeNums.size() <= n){
            if(num%3 != 0 && String.valueOf(num).indexOf("3") < 0){
                threeNums.add(num);
            }
            num++;
        }

        answer = threeNums.get(n-1);

        return answer;
    }
}