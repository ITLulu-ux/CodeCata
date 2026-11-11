package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int solution(String t, String p) {
                int length = t.length() - p.length() + 1;
                long pNum = Long.parseLong(p);
                int answer = 0;

                for (int i = 0; i < length; i++) {
                    String temp = t.substring(i, i + p.length());

                    if (Long.parseLong(temp) <= pNum) {
                        answer++;
                    }
                }
                return answer;
            }
        }
    }
}