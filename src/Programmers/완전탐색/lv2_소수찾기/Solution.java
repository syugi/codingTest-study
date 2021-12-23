package Programmers.완전탐색.lv2_소수찾기;

import java.util.ArrayList;
import java.util.Arrays;

/*
    코딩테스트연습 > 완전탐색 > 소수찾기
    https://programmers.co.kr/learn/courses/30/lessons/42839

    한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
    각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
    */
class Solution {
    boolean[] check = new boolean[10];
    ArrayList<Integer> arr = new ArrayList<>();
    public int solution(String numbers) {
        int answer = 0;
        String tmp = "";

        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, tmp, i + 1);
        }
        for (int i = 0; i < arr.size(); i++) {
            if(isPrime(arr.get(i)))
                answer++;
        }

        return answer;
    }

    public void dfs(String str, String tmp, int m) {
        if (tmp.length() == m) {
            int num = Integer.parseInt(tmp);
            if (!arr.contains(num)) {
                arr.add(num);
            }
            return;

        }else{
            for (int i = 0; i < str.length(); i++) {
                if(!check[i]){
                    check[i] = true;
                    tmp += str.charAt(i);
                    dfs(str, tmp, m);
                    check[i] = false;
                    tmp = tmp.substring(0, tmp.length() - 1);
                }
            }
        }
    }

    public boolean isPrime(int num){
        if(num == 0) return false;
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
