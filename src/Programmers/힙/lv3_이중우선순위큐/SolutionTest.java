package Programmers.힙.lv3_이중우선순위큐;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("이중우선순위큐-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String[] operations   = new String[]{"I 16","D 1"};

        int[] result = s.solution(operations);

        assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    @DisplayName("이중우선순위큐-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        String[] operations   = new String[]{"I 7","I 5","I -5","D -1"};

        int[] result = s.solution(operations);

        assertArrayEquals(new int[]{7, 5}, result);
    }

}