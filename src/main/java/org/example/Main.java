package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {

            public int[] solution(int n, int m) {
                int gcd = gcd(n, m);
                return new int[] {gcd, (int)((long) n * m / gcd)}; // long으로 캐스팅하여 오버플로우 방지
            }

            // 유클리드 호제법을 이용한 최대공약수 계산
            public int gcd(int a, int b) {
                return (b == 0) ? a : gcd(b, a % b);
            }

        }
    }
}