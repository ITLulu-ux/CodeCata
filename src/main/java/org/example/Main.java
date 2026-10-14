package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int solution(long num) {
                int answer = 0;

                while(num != 1) {
                    if(num % 2 == 0)
                        num /= 2;
                    else
                        num = num * 3 + 1;
                    answer++;

                    if(answer >= 500) {
                        answer = -1;
                        break;
                    }
                }

                return answer;
            }
        }
    }
}