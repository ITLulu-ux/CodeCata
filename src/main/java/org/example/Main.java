package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, int n) {
                String answer = "";

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    // 공백일 경우
                    if (ch == ' ') {
                        answer += ch;
                        continue;
                    }

                    // ch가 소문자인 경우
                    if (ch >= 'a' && ch <= 'z') {
                        answer += (char) ((ch - 'a' + n) % 26 + 'a');
                    } else { // ch가 대문자인 경우
                        answer += (char) ((ch - 'A' + n) % 26 + 'A');
                    }

                }
                return answer;
            }
        }
    }
}