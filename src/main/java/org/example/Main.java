package org.example;

import java.util.*;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        class Solution {
            public int solution(int[] absolutes, boolean[] signs) {
                int answer = 0;
                for (int i=0; i<signs.length; i++)
                    answer += absolutes[i] * (signs[i]? 1: -1);
                return answer;
            }
        }
    }
}