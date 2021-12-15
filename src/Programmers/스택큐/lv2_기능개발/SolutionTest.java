package Programmers.스택큐.lv2_기능개발;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("기능개발-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[] progresses = new int[]{93, 30, 55};
        int[] speeds  = new int[]{1, 30, 5};

        int[] result = s.solution(progresses, speeds);

        assertArrayEquals(result,new int[]{2, 1});
    }

    @Test
    @DisplayName("기능개발-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds  = new int[]{1, 1, 1, 1, 1, 1};

        int[] result = s.solution(progresses, speeds);

        assertArrayEquals(result,new int[]{1, 3, 2});
    }
}