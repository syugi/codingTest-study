package Programmers.해시.완주하지_못한_선수;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion  = new String[]{"eden", "kiki"};

        String result = s.solution(participant, completion);

        assertEquals(result,"leo");
    }

    @Test
    @DisplayName("테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();

        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion  = new String[]{"josipa", "filipa", "marina", "nikola"};

        String result = s.solution(participant, completion);

        assertEquals(result,"vinko");
    }

    @Test
    @DisplayName("테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion  = new String[]{"stanko", "ana", "mislav"};

        String result = s.solution(participant, completion);

        assertEquals(result,"mislav");
    }

}