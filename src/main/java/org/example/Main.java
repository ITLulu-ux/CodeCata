package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public long solution(long n) {
                long sqrt = (long) Math.sqrt(n); // 제곱근을 구하고 long으로 형 변환

                // 제곱근의 제곱이 n과 같다면 다음 제곱수를 반환
                if (sqrt * sqrt == n) {
                    return (sqrt + 1) * (sqrt + 1);
                }

                // 제곱수가 아니면 -1 반환
                return -1;
            }
        }
    }
}