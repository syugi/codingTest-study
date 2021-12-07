package Programmers.해시.lv2_전화번호_목록;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test
    @DisplayName("전화번호목록-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String[] phone_book = new String[]{"119", "97674223", "1195524421"};

        boolean result = s.solution(phone_book);

        assertEquals(result,false);
    }

    @Test
    @DisplayName("전화번호목록-테스트케이스2")
    public void solutionTest2() {
        Solution s = new Solution();
        String[] phone_book = new String[]{"123","456","789"};

        boolean result = s.solution(phone_book);

        assertEquals(result,true);
    }

    @Test
    @DisplayName("전화번호목록-테스트케이스3")
    public void solutionTest3() {
        Solution s = new Solution();

        String[] phone_book = new String[]{"12","123","1235","567","88"};

        boolean result = s.solution(phone_book);

        assertEquals(result,false);
    }

}