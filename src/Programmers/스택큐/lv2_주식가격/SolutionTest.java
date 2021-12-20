package Programmers.스택큐.lv2_주식가격;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    @DisplayName("주식가격-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[] prices = new int[]{1, 2, 3, 2, 3};

        int[] result = s.solution(prices);

        assertArrayEquals(result,new int[]{4, 3, 1, 1, 0});
    }
}