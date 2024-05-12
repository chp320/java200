package org.list.ex187;

public class CakeMain {

    public static void main(String[] args) {
        CakePlate cake = new CakePlate();           // cake 접시 준비
        CakeEater eater = new CakeEater(cake);      // cake 접시 공유
        CakeMaker maker = new CakeMaker(cake);      // cake 접시 공유
        /* 접시에 올려진 빵이 10개 이상인 경우 CakeEater 가 먹을 때까지 기다리고,
           접시에 올려진 빵이 없으면 CakeMaker 가 만들 때가지 기다린다.
           --> 즉, wait(), notifyAll() 을 잘 써야 함!! ㅎㅎ */

        eater.start();
        maker.start();
    }
}
