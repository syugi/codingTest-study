package Programmers.힙.lv3_디스크_컨트롤러;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("디스크컨트롤러-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[][] jobs   = new int[][]{{0,3},{1,9},{2,6}};

        int result = s.solution(jobs);

        assertEquals(9, result);
    }

}