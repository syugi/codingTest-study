package Programmers.탐욕법.lv3_단속카메라;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("단속카메라-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int n = 4;
        int[][] routes = new int[][]{{-20,-15},{-14,-5},{-18,-13},{-5,-3}};

        int result = s.solution(n,routes);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("단속카메라-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int n = 4;
        int[][] routes = new int[][]{{15,20},{5,14},{13,18},{3,5}};

        int result = s.solution(n,routes);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("단속카메라-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        int n = 4;
        int[][] routes = new int[][]{{-20,-15},{-10,-5},{-3,-1}};

        int result = s.solution(n,routes);

        assertEquals(3, result);
    }
}