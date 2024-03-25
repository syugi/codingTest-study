package Programmers.연습.lv0_안전지대;

/**
 * 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
 * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
 * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
 * https://school.programmers.co.kr/learn/courses/30/lessons/120866
 */
class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 1) {
                    setSafety(board, i, j - 1);
                    setSafety(board, i, j + 1);
                    setSafety(board, i - 1, j - 1);
                    setSafety(board, i - 1, j);
                    setSafety(board, i - 1, j + 1);
                    setSafety(board, i + 1, j - 1);
                    setSafety(board, i + 1, j);
                    setSafety(board, i + 1, j + 1);
                }
            }
        }

        for(int r=0; r<board.length; r++){
            for(int h=0; h< board.length; h++){
                if(board[r][h] == 0) answer++;
            }
        }

        return answer;
    }

    private void setSafety(int[][] board, int i, int j){
        if(i<0 || j<0 || i >= board.length || j >= board.length) return;
        if(board[i][j] > 0) return;

        board[i][j] = 2;
    }

}
