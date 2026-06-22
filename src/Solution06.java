import java.util.*;

public class Solution06 {
    public int solution(int[] people, int limit) {

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== 구명보트 디버깅 및 테스트 ===");
        Solution06 solution = new Solution06();

        // 테스트 케이스 1
        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;
        int expected1 = 3;
        int result1 = solution.solution(people1.clone(), limit1);
        System.out.printf("Test Case 1: %s (결과: %d, 기대값: %d)\n",
                (result1 == expected1 ? "PASS" : "FAIL"), result1, expected1);

        // 테스트 케이스 2
        int[] people2 = {70, 80, 50};
        int limit2 = 100;
        int expected2 = 3;
        int result2 = solution.solution(people2.clone(), limit2);
        System.out.printf("Test Case 2: %s (결과: %d, 기대값: %d)\n",
                (result2 == expected2 ? "PASS" : "FAIL"), result2, expected2);
    }
}
