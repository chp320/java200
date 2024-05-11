package org.list.ex148;

public class FlyerMain {

    public static void main(String[] args) {
        System.out.println(Flyer.fast);     // 상수

        Bird bird = new Bird();
        FlyerUtil.show(bird);

        Airplane airplane = new Airplane();
        airplane.fly();
        FlyerUtil.show(airplane);

        Flyer flyer = new Bird();
        flyer.fly();
        System.out.println(flyer.isAnimal());
        FlyerUtil.show(flyer);

        Bird bird1 = (Bird) flyer;
        FlyerUtil.show(bird1);
    }
}
