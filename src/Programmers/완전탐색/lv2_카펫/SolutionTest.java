package Programmers.완전탐색.lv2_카펫;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("카펫-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int brown  = 10;
        int yellow = 2;

        int[] result = s.solution(brown, yellow);

        assertArrayEquals(new int[]{4,3}, result);
    }


    @Test
    @DisplayName("카펫-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int brown  = 8;
        int yellow = 1;

        int[] result = s.solution(brown, yellow);

        assertArrayEquals(new int[]{3,3}, result);
    }

    @Test
    @DisplayName("카펫-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        int brown  = 24;
        int yellow = 24;

        int[] result = s.solution(brown, yellow);

        assertArrayEquals(new int[]{8,6}, result);
    }

}