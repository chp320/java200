package org.list.ex187;

/**
 * 목적: 쓰레드간 통신 및 쓰레드 작업 지연 기능 확인
 * - 동기화와 쓰레드 간 통신인 wait(), notifyAll()
 *******************************************************************************************
 * 1. 여러 쓰레드에서 동시에 '같은' 데이터에 접근할 경우
 * 2. 동일 데이터를 사용하는 한 작업 단위가 종료되지 않은 상태에서 다른 작업 단위가 시작할 경우
 * ==> '공유된 데이터 신뢰성' 깨질 수 있음
 * ==> 이를 방지하기 위해 synchronized 키워드 사용 !!
 * ==> 데이터 동기화(synchronized)한 경우, 공유된 데이터는 "한 쓰레드"에서만 사용 가능한 "락(lock)" 상태가 됨
 * ==> 동기화 된 쓰레드가 wait() 메서드 호출하면 락이 걸린 데이터를 더이상 사용하지 않고 다른 동기화된 쓰레드에게 넘긴다.
 * ==> 다른 쓰레드에서 작업 끝난 후 다시 원래 쓰레드에게 전달하려면 notifyAll() 메서드 호출 !!
 */
public class CakePlate {

    private int breadCount = 0;

    public CakePlate() {}

    public synchronized void makeBread() {
        if (breadCount >= 10) {
            System.out.println("빵이 남는다.");
            try {
                wait();             // 빵을 먹을 때까지 기다린다.
            } catch (InterruptedException e) {}
        }

        breadCount++;               // 빵이 10개가 안된다면 후딱 만들자.
        System.out.println("빵을 1개 만듦. 총: " + breadCount + "개");

        // Wakes up all threads that are waiting on this object's monitor. A thread waits on an object's monitor by calling one of the wait methods.
        this.notifyAll();           // 락(lock) 이 걸린 동기화 쓰레드에게 알림
    }

    public synchronized void eatBread() {
        if (breadCount < 1) {
            System.out.println("빵이 모자라 기다림.");
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        breadCount--;               // 빵이 있으니 후딱 먹자.
        System.out.println("빵을 1개 먹음. 총: " + breadCount + "개");

        this.notifyAll();
    }

    // 33번째 줄, 47번째 줄을 지우면 서로가 기다리는 상태인 '데드락(Dead Lock)' 이 됨
    // 데드락을 방지하려면 wait, notifyAll 을 잘 써야 함 ㄷㄷㄷ
}
