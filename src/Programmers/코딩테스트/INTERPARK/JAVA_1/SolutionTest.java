package Programmers.코딩테스트.INTERPARK.JAVA_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("테스트케이스1")
    public void solutionTest1() {

        Solution s = new Solution();

        int[] price = {4,1,4,7,6};
        int[] result = s.solution(price);



        assertArrayEquals(result,new int[]{3,1,1,-1,-1});
    }

    @Test
    @DisplayName("테스트케이스2")
    public void solutionTest2() {

        Solution s = new Solution();

        int[] price = {13,7,3,7,5,16,12};
        int[] result = s.solution(price);
        System.out.println("result = " + result);
        assertArrayEquals(result,new int[]{5,4,1,2,1,-1,-1});
    }

}