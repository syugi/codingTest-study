package Programmers.탐욕법.lv3_섬_연결하기;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("섬 연결하기-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int n = 4;
        int[][] costs = new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};

        int result = s.solution(n,costs);

        assertEquals(4, result);
    }
}