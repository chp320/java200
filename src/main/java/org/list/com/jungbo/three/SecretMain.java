package org.list.com.jungbo.three;

import org.list.com.jungbo.one.MyMotherFriendSecret;
import org.list.com.jungbo.one.MyMotherSecret;
import org.list.com.jungbo.one.MySistersSecret;
import org.list.com.jungbo.two.MyTopSecret;

public class SecretMain {

    public static void main(String[] args) {
        MyMotherSecret mother = new MyMotherSecret();
        MySistersSecret sister = new MySistersSecret();
        MyMotherFriendSecret momFriend = new MyMotherFriendSecret();
        MyTopSecret my = new MyTopSecret();

        System.out.println(mother.getSlushMoney());
        System.out.println(mother);
        System.out.println(sister.getSlushMoney());
        System.out.println(sister);
        momFriend.seeMyMother(mother);
        System.out.println(momFriend);
        System.out.println(momFriend.getAddress());
        System.out.println(my);
        System.out.println(my.getSlushMoney());
    }
}
