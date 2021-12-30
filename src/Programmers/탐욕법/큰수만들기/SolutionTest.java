package Programmers.탐욕법.큰수만들기;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("큰수만들기-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String number = "1924";
        int k         = 2;

        String result = s.solution(number, k);

        assertEquals("94", result);
    }

    @Test
    @DisplayName("큰수만들기-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        String number = "1231234";
        int k         = 3;

        String result = s.solution(number, k);

        assertEquals("3234", result);
    }

    @Test
    @DisplayName("큰수만들기-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        String number = "4177252841";
        int k         = 4;

        String result = s.solution(number, k);

        assertEquals("775841", result);
    }
}