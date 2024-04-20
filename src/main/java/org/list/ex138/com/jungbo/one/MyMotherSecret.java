package org.list.ex138.com.jungbo.one;

public class MyMotherSecret {
    // 멤버 변수
    protected int age = 35; // 상속 관계 클래스에서 public 과 같이 사용되며, 상속 관계 아닌 클래스에서  '기본 접근 제한자' 와 같이 사용됨
    String blood = "A";     // 기본 접근 제한자 → 동일 패키지 내 클래스에서 접근 가능
    private double slushMoney = 300;    // 동일 패키지 내 클래스에서 접근 가능

    public MyMotherSecret(int age, String blood, double slushMoney) {
        this.age = age;
        this.blood = blood;
        this.slushMoney = slushMoney;
    }

    public MyMotherSecret() {
        this(35, "A", 300);
    }

    public double getSlushMoney() {
        return slushMoney;
    }

    public String toString() {
        return "나이: " + age + ", 혈액형: " + blood + ", 비자금: " + slushMoney;
    }
}
