package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                while(n>0) {
                    answer += n%10;
                    n/=10;
                }
                return answer;
            }
        }
    }
}