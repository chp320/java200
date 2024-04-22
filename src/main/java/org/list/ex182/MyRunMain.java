package org.list.ex182;

public class MyRunMain {
    public static void main(String[] args) {
        MyRun mr1 = new MyRun();
        Thread t1 = new Thread(mr1);    // 메인 쓰레드 외에 새로운 쓰레드 생성을 위해 Runnable을 구현한 MyRun 객체의 레퍼런스를 전달
        MyThread t2 = new MyThread();   // 메인 쓰레드가 아닌 새로운 쓰레드

        t1.start();
        t2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("M");
        }
    }
}
