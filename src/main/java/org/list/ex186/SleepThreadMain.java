package org.list.ex186;

public class SleepThreadMain {

    public static void main(String[] args) {
        SleepThread t1 = new SleepThread("a");
        SleepThread t2 = new SleepThread("b");
        SleepThread t3 = new SleepThread("c");

        t2.setPriority(7);          // Thread 의 기본 우선순위는 '5'이다! 숫자가 클 수록 우선순위가 높음! 우선순위 범위는 1~10임.
        t1.start();
        try {
            t1.join();              // Waits for this thread to die. -> Thread 는 t1 작업이 끝날 때 까지 다른 쓰레드는 대기 시킴.
        } catch (InterruptedException e) {}     // t1 이 끝나면 JVM 이 InterruptedException 을 발생시키므로 형식적인 try-catch 가 필요함
        t2.start();
        t3.start();
    }
}
