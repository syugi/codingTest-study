package Programmers.탐욕법.체육복;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("체육복-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int n         = 5;
        int[] lost    = new int[]{2, 4};
        int[] reserve = new int[]{1, 3, 5};

        int result = s.solution(n, lost, reserve);

        assertEquals(5, result);
    }

    @Test
    @DisplayName("체육복-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int n         = 5;
        int[] lost    = new int[]{2, 4};
        int[] reserve = new int[]{3};

        int result = s.solution(n, lost, reserve);

        assertEquals(4, result);
    }

    @Test
    @DisplayName("체육복-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        int n         = 3;
        int[] lost    = new int[]{3};
        int[] reserve = new int[]{1};

        int result = s.solution(n, lost, reserve);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("체육복-테스트케이스4")
    public void solutionTest4() {
        Solution s = new Solution();

        int n         = 5;
        int[] lost    = new int[]{3,5};
        int[] reserve = new int[]{4};

        int result = s.solution(n, lost, reserve);

        assertEquals(4, result);
    }

    @Test
    @DisplayName("체육복-테스트케이스5")
    public void solutionTest5() {
        Solution s = new Solution();

        int n         = 5;
        int[] lost    = new int[]{2,4};
        int[] reserve = new int[]{3,5};

        int result = s.solution(n, lost, reserve);

        assertEquals(5, result);
    }
}