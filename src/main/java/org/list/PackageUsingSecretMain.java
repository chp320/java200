package org.list;

/* 본 클래스는 com.jungbo.one.*, com.jungbo.two.* 와 다른 패키지이고, 다른 클래스들과 상속 관계 아님
 * 따라서 앞선 클래스의 protected, private, 기본 접근 제한자를 가진 멤버에 접근 불가하다 !!
 * 사용하려는 클래스를 import 하게 되면, 패키지와 무관하게 public 멤버 사용 가능 !!
 */

import org.list.com.jungbo.one.MyMotherSecret;
import org.list.com.jungbo.two.MyTopSecret;

public class PackageUsingSecretMain {

    public static void main(String[] args) {
        MyMotherSecret mother = new MyMotherSecret();
        MyTopSecret my = new MyTopSecret();

        System.out.println(mother.getSlushMoney());
        System.out.println(mother);
        System.out.println(my.getSlushMoney());
        System.out.println(my);
    }
}
