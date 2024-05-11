package org.list.ex148;

/*
 * 인터페이스는 자기 이름으로 자신의 객체 생성 불가
 * 하지만 자기 이름으로 인터페이스를 '구현한' 클래스 객체 생성 가능 !!
 * - 인터페이스의 추상 메서드(선언된 메서드, 프로토 타입 메서드)는 "반드시" 인터페이스를 '구현'하는 클래스에서 구현되어야 함 !!
 * - 추상 메서드를 구현하지 않은 클래스는 "추상 클래스"가 됨
 * -> 인터페이스를 만든 '의도'대로 구현하도록 강제하기 위함 !!
 *********************************************************************************************
 * 1) 인터페이스 내 선언된 변수는 "상수"가 된다. ex) int a=1; -> public static final int a=1; 이 됨
 * 2) 상속(extends) 과 같이 사용될 경우 우선순위는 .. 상속(extends) > 인터페이스(implements) 순이다.
 */
public interface Flyer {
    int fast = 100;     // 상수가 됨
    void fly();         // 추상 메서드. 구현 클래스에서 이를 구현하지 않는다면 '추상 클래스'가 된다.
    boolean isAnimal();
}
