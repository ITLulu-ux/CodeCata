package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public long solution(int a, int b) {
                long answer = 0;
                long min = Math.min(a, b);
                long max = Math.max(a, b);

                for (long i = min; i <= max; i++) {
                    answer += i;
                }

                return answer;
            }
        }
    }
}