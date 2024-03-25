package Programmers.연습.lv0_OX퀴즈;

/**
 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
 * 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++){
            String[] qArr = quiz[i].split(" ");
            System.out.println("qArr = " + qArr);

            int num1 = Integer.parseInt(qArr[0]);
            int num2 = Integer.parseInt(qArr[2]);
            int result = Integer.parseInt(qArr[4]);
            if(qArr[1].equals("-")) num2 *= -1;

            if(num1 + num2 == result){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }
}