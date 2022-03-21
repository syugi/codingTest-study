package Programmers.코딩테스트.ITP.JAVA_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("2-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String a = "1234";
        String b = "5678";
        String result = s.solution(a, b);

        assertEquals("6912", result);
    }

    @Test
    @DisplayName("2-테스트케이스3")
    public void solutionTest2() {
        Solution s = new Solution();

        String a = "1111";
        String b = "8889";
        String result = s.solution(a, b);

        assertEquals("10000", result);
    }

    @Test
    @DisplayName("2-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        String a = "123456789";
        String b = "8889";
        String result = s.solution(a, b);

        assertEquals("123465678", result);
    }

    @Test
    @DisplayName("2-테스트케이스4")
    public void solutionTest4() {
        Solution s = new Solution();

        String a = "1111111111111111111111111111111111111111";
        String b = "1";
        String result = s.solution(a, b);

        assertEquals("1111111111111111111111111111111111111112", result);
    }

}