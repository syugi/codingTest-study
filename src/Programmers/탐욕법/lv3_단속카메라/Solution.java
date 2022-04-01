package Programmers.탐욕법.lv3_단속카메라;

import java.util.Arrays;
import java.util.Comparator;

/*
    코딩테스트연습 > 탐욕법(Greedy) > 단속카메라
    https://programmers.co.kr/learn/courses/30/lessons/42884

    고속도로를 이동하는 모든 차량이 고속도로를 이용하면서 단속용 카메라를 한 번은 만나도록 카메라를 설치하려고 합니다.
    고속도로를 이동하는 차량의 경로 routes가 매개변수로 주어질 때, 모든 차량이 한 번은 단속용 카메라를 만나도록 하려면
    최소 몇 대의 카메라를 설치해야 하는지를 return 하도록 solution 함수를 완성하세요.
 */
class Solution {

    public int solution(int n, int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, Comparator.comparingInt(o -> o[1]));

        int point = -30001;
        for (int[] route : routes) {
            int start = route[0];
            int end = route[1];
            if(point < start){
                point = end;
                answer++;
                System.out.println("answer++");
            }
            System.out.println("route = " + Arrays.toString(route)+" point : "+point);
        }

        return answer;
    }
}