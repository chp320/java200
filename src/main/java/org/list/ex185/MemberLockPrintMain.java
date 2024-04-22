package org.list.ex185;

public class MemberLockPrintMain {
    public static void main(String[] args) {
        MemberLockPrint mr1 = new MemberLockPrint();

        Thread t1 = new Thread(mr1, "a");
        Thread t2 = new Thread(mr1, "b");
        Thread t3 = new Thread(mr1, "c");

        t1.start();
        t2.start();
        t3.start();
    }
}
