package Programmers.정렬.lv2_H_Index;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("H_Index-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[] citations  = new int[]{3, 0, 6, 1, 5};

        int result = s.solution(citations);

        assertEquals(3, result);
    }


    @Test
    @DisplayName("H_Index-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int[] citations  = new int[]{0, 0, 0, 0, 0};

        int result = s.solution(citations);

        assertEquals(0, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        int[] citations  = new int[]{0, 0, 0, 0, 1};

        int result = s.solution(citations);

        assertEquals(1, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스4")
    public void solutionTest4() {
        Solution s = new Solution();

        int[] citations  = new int[]{9, 9, 9, 12};

        int result = s.solution(citations);

        assertEquals(4, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스5")
    public void solutionTest5() {
        Solution s = new Solution();

        int[] citations  = new int[]{9, 7, 6, 2, 1};

        int result = s.solution(citations);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스6")
    public void solutionTest6() {
        Solution s = new Solution();

        int[] citations  = new int[]{10, 8, 5, 4, 3};

        int result = s.solution(citations);

        assertEquals(4, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스7")
    public void solutionTest7() {
        Solution s = new Solution();

        int[] citations  = new int[]{25, 8, 5, 3, 3};

        int result = s.solution(citations);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스8")
    public void solutionTest8() {
        Solution s = new Solution();

        int[] citations  = new int[]{1, 1, 5, 7, 6};

        int result = s.solution(citations);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스9")
    public void solutionTest9() {
        Solution s = new Solution();

        int[] citations  = new int[]{0};

        int result = s.solution(citations);

        assertEquals(0, result);
    }

    @Test
    @DisplayName("H_Index-테스트케이스10")
    public void solutionTest10() {
        Solution s = new Solution();

        int[] citations  = new int[]{0, 0};

        int result = s.solution(citations);

        assertEquals(0, result);
    }
}