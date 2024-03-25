package Programmers.연습.lv1_약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int n=left; n<=right; n++){
            int cnt = 1;

            for(int i=1; i<=n/2; i++){
                if(n % i == 0){
                    cnt++;
                }
            }

            if(cnt%2 == 0){
                answer += n;
            }else{
                answer -= n;
            }
        }

        return answer;
    }
}

/* 다른사람 풀이 참고

    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
 */