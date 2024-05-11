package org.list.ex149;

public class SeaAirplaneMain {

    public static void main(String[] args) {
        SeaAirplane seaAirplane = new SeaAirplane("CS110");
        Plane plane = seaAirplane;
        Ship ship = seaAirplane;

        SeaAirplaneUtil.show(seaAirplane);
        SeaAirplaneUtil.show(plane);
    }
}
