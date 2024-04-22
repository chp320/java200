package org.list.ex184;

public class MemberPrint implements Runnable {

    private int i = 0;      // 멤버 필드
    @Override
    public void run() {
        show();
    }

    private void show() {
        for (int i = 0; i < 100; i++) {
            if (Thread.currentThread().getName().equals("a")) {
                System.out.println("[A-" + i + "]");
            } else if (Thread.currentThread().getName().equals("b")) {
                System.out.println("[B-" + i + "]");
            } else if (Thread.currentThread().getName().equals("c")) {
                System.out.println("[C-" + i + "]");
            }
        }
    }
}
