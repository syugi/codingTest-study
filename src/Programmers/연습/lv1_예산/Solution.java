package Programmers.연습.lv1_예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int dep = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length ; i++){
            if(sum + d[i] <= budget){
                sum+=d[i];
                dep++;
            }
        }

        answer = dep;

        return answer;
    }
}