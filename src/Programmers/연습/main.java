package Programmers.연습;

public class main {
    public static void main(String[]args){
        Solution s = new Solution();
//        s.solution(new int[][] {
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0}
//        });
//        s.solution(new int[][] {
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 1, 1, 0},
//                {0, 0, 0, 0, 0}
//        });
        s.solution(new int[][] {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        });
    }
}

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
