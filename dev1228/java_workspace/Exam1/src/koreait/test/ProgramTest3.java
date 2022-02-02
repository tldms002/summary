package koreait.test;

import java.util.ArrayList;

public class ProgramTest3 {
    public static void main(String[] args) {
        ArrayList<String> singers = new ArrayList<>();
        singers.add("boa");
        singers.add("소녀시대");
        singers.add("아이유");
        singers.add("twice");
        singers.add("악동뮤지션");
        singers.add("나훈아");
        int i;
        String find = "나훈아";
        System.out.println("실행 시작합니다. ------------------------------");
        for (i = 0; i < singers.size(); i++) {
            if (singers.get(i).equals(find)) {
                System.out.println(find + "는 index " + i + "의 데이터 입니다.");
            }
        }
        System.out.println("실행 종료합니다. ------------------------------");
    }
}