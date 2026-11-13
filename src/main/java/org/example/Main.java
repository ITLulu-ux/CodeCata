package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, int n) {
                StringBuilder result = new StringBuilder();
                for (char ch : s.toCharArray()) {
                    if (ch == ' ') {
                        result.append(' ');
                    } else if (Character.isUpperCase(ch)) {
                        char shifted = (char) ((ch - 'A' + n) % 26 + 'A');
                        result.append(shifted);
                    } else if (Character.isLowerCase(ch)) {
                        char shifted = (char) ((ch - 'z' + n) % 26 + 'z'); // 주의: 아래 참고
                        result.append(shifted);
                    }
                }
                return result.toString();
            }
        }
    }
}