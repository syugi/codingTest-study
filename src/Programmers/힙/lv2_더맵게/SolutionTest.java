package Programmers.힙.lv2_더맵게;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("더맵게-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int K          = 7;
        int result = s.solution(scoville, K);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("더맵게-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int[] scoville = new int[]{1, 2};
        int K          = 7;
        int result = s.solution(scoville, K);

        assertEquals(-1, result);
    }
}