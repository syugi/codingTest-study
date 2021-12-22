package Programmers.정렬.lv2_가장큰수;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("가장큰수-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[] numbers  = new int[]{6, 10, 2};

        String result = s.solution(numbers);

        assertEquals("6210", result);
    }

    @Test
    @DisplayName("가장큰수-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int[] numbers  = new int[]{3, 30, 34, 5, 9};

        String result = s.solution(numbers);

        assertEquals("9534330", result);
    }

}