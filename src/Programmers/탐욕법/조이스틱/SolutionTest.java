package Programmers.탐욕법.조이스틱;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("조이스틱-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String name = "JAZ";

        int result = s.solution(name);

        assertEquals(11, result);
    }

    @Test
    @DisplayName("조이스틱-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        String name = "JEROEN";

        int result = s.solution(name);

        assertEquals(56, result);
    }

    @Test
    @DisplayName("조이스틱-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        String name = "JAN";

        int result = s.solution(name);

        assertEquals(23, result);
    }

    @Test
    @DisplayName("조이스틱-테스트케이스4")
    public void solutionTest4() {
        Solution s = new Solution();

        String name = "JANB";

        int result = s.solution(name);

        assertEquals(25, result);
    }

}