package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        class Solution {
            public long solution(int price, int money, int count) {
                long answer = 0;
                long total=0;

                //탄 횟수만큼 금액 늘리며 더하기
                for(int i=1; i<count+1; i++){
                    total += price*i;
                }
                //가진 돈보다 비용이 많이 들 경우
                if(money<total)
                    answer = total-money;
                    //모자라지 않는 경우
                else
                    answer = 0;

                return answer;
            }
        }
    }
}