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

    @Test
    @DisplayName("디스크컨트롤러-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int[][] jobs   = new int[][]{{24, 10}, {28, 39}, {43, 20}, {37, 5}, {47, 22}, {20, 47}, {15, 34}, {15, 2}, {35, 43}, {26, 1}};

        int result = s.solution(jobs);

        assertEquals(72, result);
    }

    @Test
    @DisplayName("디스크컨트롤러-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        int[][] jobs   = new int[][]{{0, 5}, {2, 10}, {10000, 2}};

        int result = s.solution(jobs);

        assertEquals(6, result);
    }
}