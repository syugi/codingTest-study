package Programmers.해시.lv2_위장;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String[][] clothes = new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        int result = s.solution(clothes);

        assertEquals(result,5);
    }

    @Test
    @DisplayName("테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();
        String[][] clothes = new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

        int result = s.solution(clothes);

        assertEquals(result,3);
    }
}