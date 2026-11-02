package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public boolean solution(String s) {
                if (s.length() != 4 && s.length() != 6) {
                    return false;
                }
                for (char c : s.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}