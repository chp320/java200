package org.list.ex186;

/**
 * 목적: thread 와 sleep 메서드의 사용법을 익힌다.
 * 쓰레드 생성 방법 2가지
 * - java.lang.Runnable 구현하는 방법
 * - java.lang.Thread 상속하는 방법
 * ---> 자바에서는 '다중 상속'이 불가하여 Runnable 을 많이 사용함
 * ---> Thread 상속하거나 Runnable 구현하는 경우 모두 run() 메서드 구현 필요!
 */
public class SleepThread extends Thread {

    public SleepThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        show();
    }

    private void show() {
        for (int i = 0; i < 10; i++) {
            print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    private void print(int index) {
        System.out.println(getName() + "-" + index);
    }
}
