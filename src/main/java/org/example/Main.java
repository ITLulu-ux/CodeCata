package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                StringBuilder answer = new StringBuilder();
                int idx = 0;

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == ' ') {
                        idx = 0; // 공백을 만나면 인덱스 초기화
                        answer.append(" ");
                    } else {
                        if (idx % 2 == 0) {
                            answer.append(Character.toUpperCase(c));
                        } else {
                            answer.append(Character.toLowerCase(c));
                        }
                        idx++;
                    }
                }
                return answer.toString();
            }
        }
    }
}