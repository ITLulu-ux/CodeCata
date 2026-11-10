package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {

            public int solution(int[] number) {
                int answer = 0;
                int n = number.length;

                for (int i = 0; i < n - 2; i++) {
                    for (int j = i + 1; j < n - 1; j++) {
                        for (int k = j + 1; k < n; k++) {
                            if (number[i] + number[j] + number[k] == 0) {
                                answer++;
                            }
                        }
                    }
                }
                return answer;
            }
        }
    }
}