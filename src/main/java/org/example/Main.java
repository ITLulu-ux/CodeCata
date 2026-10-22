package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr) {
                // 배열 길이가 1 이하인 경우 -1을 담아 리턴
                if (arr.length <= 1) {
                    return new int[]{-1};
                }

                // 배열에서 가장 작은 값 구하기
                int min = Arrays.stream(arr).min().getAsInt();

                // 가장 작은 수를 제외한 요소들만 필터링하여 배열로 리턴
                return Arrays.stream(arr)
                        .filter(i -> i != min)
                        .toArray();
            }
        }
    }
}