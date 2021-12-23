package Programmers.완전탐색.lv2_소수찾기;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("소수찾기-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String numbers  = "17";

        int result = s.solution(numbers);

        assertEquals(3, result);
    }


    @Test
    @DisplayName("소수찾기-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        String numbers  = "011";

        int result = s.solution(numbers);

        assertEquals(2, result);
    }

}