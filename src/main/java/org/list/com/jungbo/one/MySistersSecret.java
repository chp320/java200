package org.list.com.jungbo.one;

/* MySistersSecret 은 MyMotherSecret 클래스를 상속하기 때문에
 * MyMotherSecret 의 protected, public 접근 제한자 이용 가능
 */
public class MySistersSecret extends MyMotherSecret {
    private int weight = 50;

    public MySistersSecret(int age, String blood, double slushMoney, int weight) {
        super(age, blood, slushMoney);
        this.weight = weight;
    }

    public MySistersSecret() {
        this(28, "A", 200, 55);
    }

    public String toString() {
        return "나이: " + age + ", 비자금: " + super.getSlushMoney() + ", 혈액형: " + blood + ", 몸무게: " + weight;
    }
}
