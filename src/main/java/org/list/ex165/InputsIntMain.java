package org.list.ex165;

public class InputsIntMain {
    public static void main(String[] args) {
        InputsInt ins = new InputsInt();

        int[] anum = ins.input(3, 0, 9);        // 0~9 까지 3개의 숫자. 중복 허용
        ins.prints(anum);
        System.out.println("\n-------------------------");
        anum = ins.input(3, 0, 9, false);    // 0~9 까지 3개의 숫자. 중복 불허
        ins.prints(anum);

        System.exit(1);
    }
}
