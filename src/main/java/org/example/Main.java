package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int solution(int angle) {
                int answer = 0;

                if (angle > 0 && angle < 90) {
                    answer=1;
                }
                else if (angle == 90) {
                    answer=2;
                }
                else if (angle > 90 && angle < 180) {
                    answer=3;
                }
                else {
                    answer=4;
                }
                return answer;
            }
        }
    }
}