package org.list.ex148;

public class Airplane implements Flyer {
    @Override
    public void fly() {
        System.out.println("엔진과 날개를 이용하여 날아감");
    }

    @Override
    public boolean isAnimal() {
        return false;
    }
}
