package org.list.ex187;

public class CakeEater extends Thread {
    // 공유 쓰레드 선언
    private CakePlate cake;

    public CakeEater(CakePlate cake) {
        setCakePlate(cake);
    }

    public CakePlate getCakePlate() {
        return cake;
    }

    public void setCakePlate(CakePlate cake) {
        this.cake = cake;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            cake.eatBread();
        }
    }
}
