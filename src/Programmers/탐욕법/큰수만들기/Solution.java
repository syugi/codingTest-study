package Programmers.탐욕법.큰수만들기;

import java.util.*;

/*
    코딩테스트연습 > 탐욕법(Greedy) > 큰수만들기
    https://programmers.co.kr/learn/courses/30/lessons/42883

    어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
    예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
    문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다.
    number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
 */
class Solution {

    public String solution(String number, int k) {

        String answer = "";

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<number.length(); i++){
            list.add(number.charAt(i) - '0');
        }

        List<Integer> removeIdxs = new ArrayList<Integer>();

        int max = list.get(0);
        int minIdx = 0;
        for (int i=1; i<list.size(); i++) {
            System.out.println("list.get(i-1)= " + list.get(i-1)+" list.get(i) = "+list.get(i));
            if(list.get(i-1) < list.get(i)){
                removeIdxs.add(i-1);
            }
            if(removeIdxs.size() == k) break;
        }
        System.out.println("removeIdxs = " + removeIdxs);

        for(int i=removeIdxs.size()-1; i>=0; i--){
            System.out.println("i : "+i+" removeIdxs.get(i) = " + removeIdxs.get(i));
            int idx = removeIdxs.get(i);
            list.remove(idx);
            System.out.println("!! list = " + list);
        }
        System.out.println("list = " + list);

        for (int n : list) {
            answer += String.valueOf(n);
        }

        return answer;
    }

}
