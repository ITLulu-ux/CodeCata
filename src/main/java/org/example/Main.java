package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(long n) {
                String str = Long.toString(n);
                StringBuilder sb = new StringBuilder(str);
                str = sb.reverse().toString();
                char[] ch = str.toCharArray();
                int[] answer = new int[ch.length];
                for (int i = 0; i < ch.length; i++) {
                    answer[i] = ch[i] - '0';
                }

                return answer;
            }
        }
    }
}