package org.list.ex182;

public class MyRun implements Runnable {

    @Override
    public void run() {
        show();
    }

    private void show() {
        for (int i = 0; i < 100; i++) {
            System.out.println("S");
        }
    }
}
