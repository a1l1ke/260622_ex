import java.util.*;

public class Solution01 {
    public int solution(String s) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution01 sol = new Solution01();

        // [입력값, 기대하는 결과값]
        String[] inputs = {
                "one4seveneight", "23four5six7", "2three45sixseven", "123",
                "zero", "zerozero77", "oneoneoneone", "1",
                "sevensevensevensevensevensevensevensevensevenseven", "zerothreefour"
        };

        int[] expected = {
                1478, 234567, 234567, 123,
                0, 77, 1111, 1,
                777777777, 34 // 7이 10개인 케이스는 int 범위를 넘지 않음 (77억이 아니므로 주의, 7이 10개면 7777777777인데 int 최대는 2147483647임)
        };

        // *주의: 7이 10개면 7,777,777,777이라 int 범위를 초과합니다.
        // 문제 조건상 "정답이 1 이상 2,000,000,000 이하인 입력만 주어진다"고 했으므로
        // 실제 프로그래머스 테스트셋에서는 결과가 21억을 넘는 입력(예: seven 10개)은 들어오지 않습니다.

        System.out.println("--- 테스트 시작 ---");
        for (int i = 0; i < inputs.length; i++) {
            // int 범위를 넘지 않도록 안전한 테스트셋으로 조정해서 검증하세요.
            if (inputs[i].length() == 50) continue;

            int result = sol.solution(inputs[i]);
            if (result == expected[i]) {
                System.out.println("Pass: " + inputs[i] + " => " + result);
            } else {
                System.out.println("FAIL: " + inputs[i] + " => Expected: " + expected[i] + ", Got: " + result);
            }
        }
    }
}
