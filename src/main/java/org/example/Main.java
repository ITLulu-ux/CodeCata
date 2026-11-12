package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] sizes) {
                int maxW = 0;
                int maxH = 0;

                for (int[] card : sizes) {
                    int w = Math.max(card[0], card[1]); // 긴 쪽
                    int h = Math.min(card[0], card[1]); // 짧은 쪽

                    maxW = Math.max(maxW, w);
                    maxH = Math.max(maxH, h);
                }

                return maxW * maxH;
            }
        }
    }
}