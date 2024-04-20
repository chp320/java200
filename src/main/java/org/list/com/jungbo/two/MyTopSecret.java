package org.list.com.jungbo.two;
import org.list.com.jungbo.one.MyMotherSecret;

public class MyTopSecret extends MyMotherSecret {

    String myBoyFriend = "CSharp";      // 기본 접근 제한자

    public MyTopSecret(int age, String blood, double slushMoney, String myBoyFriend) {
        super(age, blood, slushMoney);      // 부모 클래스인 MyMotherSecret 의 멤버변수 초기화
        this.myBoyFriend = myBoyFriend;     // 자식 클래스인 MyTopSecret 의 멤버변수 myBoyFriend 초기화
    }

    public MyTopSecret() {
        this(28, "A", 200, "Jim");
    }

    public String toString() {
        // 부모 클래스인 MyMotherSecret 클래스에서 blood 는 기본 접근 제한인데, 기본 접근 제한자는 "동일 패키지"에서만 접근 가능하기 때문에 여기서는 blood 변수에 접근 불가하다.
        return "나이: " + super.age + ", 비자금: " + super.getSlushMoney() + ", 남자친구: " + this.myBoyFriend;
    }
}
