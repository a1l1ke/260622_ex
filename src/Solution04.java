import java.util.*;

public class Solution04 {
    public int solution(int[][] triangle) {
        System.out.println("Arrays.deepToString(triangle) = " + Arrays.deepToString(triangle));
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("=== 정수 삼각형 디버깅 및 테스트 ===");
        Solution04 solution = new Solution04();

        // 테스트 케이스 1
        int[][] triangle1 = {
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}
        };
        int expected1 = 30;
        int result1 = solution.solution(triangle1);
        System.out.printf("Test Case 1: %s (결과: %d, 기대값: %d)\n",
                (result1 == expected1 ? "PASS" : "FAIL"), result1, expected1);
    }
}
