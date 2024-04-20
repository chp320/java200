package org.list.com.jungbo.one;

public class MyMotherFriendSecret {
    private String address = "종로구";

    public MyMotherFriendSecret(String address) {
        this.address = address;
    }

    public MyMotherFriendSecret() {
        this("성진구");
    }

    public String getAddress() {
        return address;
    }

    public void seeMyMother(MyMotherSecret mms) {
        StringBuffer sb = new StringBuffer();
        sb.append("우리 엄마 나이: " + mms.age + ", ");
        sb.append("우리 엄마 혈액형: " + mms.blood + ", ");
        sb.append("우리 엄마 비자금: " + mms.getSlushMoney());
        System.out.println(sb.toString());
    }
}
