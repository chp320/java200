package org.list.ex149;

public class SeaAirplaneUtil {

    public static void show(Plane plane) {
        System.out.println(plane.power());
        plane.fly();
    }

    public static void show(Ship ship) {
        System.out.println(ship.move() + "명을 태우고 ");
        System.out.println(ship.carry() + "정을 싣고 가고 있다.");
    }

    public static void show(SeaAirplane seaAirplane) {
        System.out.println(seaAirplane);
    }

    public static void showOnly(Ship ship) {
        System.out.println(ship.move() + "명을 태우고");
        System.out.println(ship.carry() + "정을 싣고 가고 있다.");
    }

    public static void showPlane(Plane plane) {
        System.out.println(plane.power());
        plane.fly();
    }
}
