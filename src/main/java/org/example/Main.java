package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public String solution(int n) {
                String answer = "";

                for(int i=1; i<=n; i++) {
                    answer += i%2!=0 ? "수" : "박";
                }

                return answer;
            }
        }
    }
}