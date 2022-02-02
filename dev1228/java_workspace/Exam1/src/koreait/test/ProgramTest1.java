package koreait.test;

public class ProgramTest1 {
    public static void main(String[] args) {
        int[] iarr = {67, 45, 98, 34, 83};
        int max = iarr[0];
        for (int i = 0; i < iarr.length; i++) {
            if (iarr[i] > max) {
                max = iarr[i];
            }
        }
        System.out.println("iarr 배열에 저장된 최대값 : " + max);
    }
}