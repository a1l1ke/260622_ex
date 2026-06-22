import java.util.*;

public class Solution04 {
    public int solution(int[][] triangle) {
        System.out.println("Arrays.deepToString(triangle) = " + Arrays.deepToString(triangle));
        int[][] memo = new int[triangle.length][triangle.length];
//        for (int[] ints : triangle) {
//            System.out.println(Arrays.toString(ints));
//        }
        for (int[] ints : triangle) {
            System.out.println(Arrays.toString(ints));
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                memo[i][j] = triangle[i][j];
            }
        }
        for (int[] ints : memo) {
            System.out.println(Arrays.toString(ints));
        }
        int answer = 0;
//        int[][] memo = new int[triangle.length][];
//        int[][] memo = new int[2000][2000];
        System.out.println("Arrays.deepToString(memo) = " + Arrays.deepToString(memo));
        
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
