package org.list.ex185;

public class StaticPrint implements Runnable {
    private static int i = 0;       // static 필드

    @Override
    public void run() {
        show();
    }

    private void show() {
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
