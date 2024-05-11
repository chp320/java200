package org.list.ex149;

public interface Ship {
    int move();     // 사람을 몇 명 나르는가?        --> 자동으로 public abstract int move(); 가 된다. 추상 메서드 !!
    int carry();    // 무기를 몇 정 나르는가?
}
