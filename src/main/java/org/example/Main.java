package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int[][] solution(int[][] arr1, int[][] arr2) {
                int[][] answer = new int[arr1.length][arr1[0].length];

                for(int i = 0; i < arr1.length; i++) {
                    for(int j = 0; j < arr1[0].length; j++) {
                        answer[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
                return answer;
            }
        }
    }
}