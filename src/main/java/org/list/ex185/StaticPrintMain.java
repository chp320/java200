package org.list.ex185;

public class StaticPrintMain {
    public static void main(String[] args) {
        StaticPrint mr1 = new StaticPrint();    // static 필드 i 를 공유하는 StaticPrint 객체 생성
        StaticPrint mr2 = new StaticPrint();
        StaticPrint mr3 = new StaticPrint();

        Thread t1 = new Thread(mr1, "a");
        Thread t2 = new Thread(mr2, "b");
        Thread t3 = new Thread(mr3, "c");

        t1.start();
        t2.start();
        t3.start();
    }
}
