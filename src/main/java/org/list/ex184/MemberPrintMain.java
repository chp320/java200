package org.list.ex184;

public class MemberPrintMain {
    public static void main(String[] args) {
        MemberPrint mr1 = new MemberPrint();        // 멤버 필드 i 를 갖는 MemberPrint 객체 생성

        Thread t1 = new Thread(mr1, "a");
        Thread t2 = new Thread(mr1, "b");
        Thread t3 = new Thread(mr1, "c");

        t1.start();
        t2.start();
        t3.start();

    }
}
