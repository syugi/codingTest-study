package Programmers.스택큐.lv2_프린터;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("프린터-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[] priorities = new int[]{2, 1, 3, 2};
        int    location  = 2;

        int result = s.solution(priorities, location);

        assertEquals(result, 1);
    }

    @Test
    @DisplayName("프린터-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
        int    location  = 0;

        int result = s.solution(priorities, location);

        assertEquals(result, 5);
    }
}