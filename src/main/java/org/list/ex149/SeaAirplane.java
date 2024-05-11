package org.list.ex149;

/* 추상 클래스 Plane 을 상속하고, 인터페이스 Ship 을 구현 */
public class SeaAirplane extends Plane implements Ship {

    private String id = "Air Balls";

    public SeaAirplane(String id) {
        this.id = id;
    }

    public SeaAirplane() {
        this("LeeMass");
    }

    /////////////////// 추상화 ///////////////////
    @Override
    public void fly() {
        System.out.println("엔진과 날개를 이용하여 날아감");
    }

    @Override
    public int power() {
        return 10000;
    }
    /////////////////// 추상화 ///////////////////

    /////////////////// 인터페이스 ///////////////////
    @Override
    public int move() {
        return 5;
    }

    @Override
    public int carry() {
        return 300;
    }
    /////////////////// 인터페이스 ///////////////////

    public String toString() {
        return this.id + "가 " + power() + "마력으로 " + move() + "명을 나른다.";
    }
}
