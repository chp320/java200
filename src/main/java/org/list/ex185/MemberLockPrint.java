package org.list.ex185;

public class MemberLockPrint implements Runnable {
    private int i = 0;
    @Override
    public void run() {
        show();
    }

    private synchronized void show() {
        for (; i < 100; i++) {
            if (Thread.currentThread().getName().equals("a")) {
                System.out.println("[A - " + i + "]");
            } else if (Thread.currentThread().getName().equals("b")) {
                System.out.println("[B - " + i + "]");
            } else if (Thread.currentThread().getName().equals("c")) {
                System.out.println("[C - " + i + "]");
            }
        }
    }
}
