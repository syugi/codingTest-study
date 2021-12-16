package Programmers.스택큐.lv2_다리를_지나는_트럭;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("다리를지나는트럭-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        int bridge_length   = 2;
        int weight          = 10;
        int[] truck_weights = new int[]{7,4,5,6};

        int result = s.solution(bridge_length, weight, truck_weights);

        assertEquals(8, result);
    }

    @Test
    @DisplayName("다리를지나는트럭-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        int bridge_length   = 100;
        int weight          = 100;
        int[] truck_weights = new int[]{10};

        int result = s.solution(bridge_length, weight, truck_weights);

        assertEquals(101,result);
    }

    @Test
    @DisplayName("다리를지나는트럭-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        int bridge_length   = 100;
        int weight          = 100;
        int[] truck_weights = new int[]{10,10,10,10,10,10,10,10,10,10};

        int result = s.solution(bridge_length, weight, truck_weights);

        assertEquals( 110,result);
    }
}