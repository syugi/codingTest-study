package Programmers.해시.lv3_베스트앨범;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("베스트앨범-테스트케이스1")
    public void solutionTest1() {
        Solution s = new Solution();

        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays     = new int[]{500, 600, 150, 800, 2500};

        int[] result = s.solution(genres, plays);
        for(int i : result){
            System.out.println("i : "+i);
        }
        assertArrayEquals(result,new int[]{4, 1, 3, 0});
    }

}