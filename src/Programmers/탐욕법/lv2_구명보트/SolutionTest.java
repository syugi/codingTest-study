package Programmers.탐욕법.lv2_구명보트;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("구명보트-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int[] people = new int[]{70, 50, 80, 50};
        int limit    = 100;

        int result = s.solution(people,limit);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("구명보트-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int[] people = new int[]{70, 80, 50};
        int limit    = 100;

        int result = s.solution(people,limit);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("구명보트-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        int[] people = new int[]{70, 50, 80, 50, 30};
        int limit    = 100;

        int result = s.solution(people,limit);

        assertEquals(3, result);
    }
}