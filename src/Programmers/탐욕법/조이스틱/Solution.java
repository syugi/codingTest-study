package Programmers.탐욕법.조이스틱;

/*
    코딩테스트연습 > 탐욕법(Greedy) > 조이스틱
    https://programmers.co.kr/learn/courses/30/lessons/42860

    조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
    ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA

    조이스틱을 각 방향으로 움직이면 아래와 같습니다.

    ▲ - 다음 알파벳
    ▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
    ◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
    ▶ - 커서를 오른쪽으로 이동
    예를 들어 아래의 방법으로 "JAZ"를 만들 수 있습니다.

    - 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
    - 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
    - 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
    따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
    만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.
 */
class Solution {

    public int solution(String name) {
        int answer = 0;
        final int END = 26;

        int pass = 0;
        for(int i=0; i<name.length(); i++){
            char c = name.charAt(i);
            int num = (int)c - 65;
            System.out.println("c = " + c+" pos : "+num);

            if(num == 0){
                pass++;
                continue;
            }else {
                if(pass > 0){
                    if(pass > END-i){
                        answer += END-i;
                    }else{
                        answer += pass-1;
                    }
                }else{
                    answer++; //커서이동
                }
            }

            if(END-num < num){
                answer += END - num;
            }else{
                answer += num;
            }

        }

        return answer;
    }

}
