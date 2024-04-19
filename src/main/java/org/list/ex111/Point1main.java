package org.list.ex111;

public class Point1main {

    public static void main(String[] args) {
        Point1 p1 = new Point1(0, 0);
        Point1 p2 = new Point1(0, 0);
        Point1 p3 = new Point1(4, 3);
        System.out.println("p1==p2 ? " + (p1 == p2));
        System.out.println("p1.equals(p2) ? " + (p1.equals(p2)));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        Point1 p4 = new Point1(p1);     /* p1 을 이용해서 p4 객체를 생성하였지만, new 로 생성된 모든 객체는 고유하므로 다른 객체이다 */
        System.out.println(p4.hashCode());
        System.out.println("p1.equals(p4) ? " + (p1.equals(p4)));

        /* String 리터럴을 제외한 모든 객체의 레퍼런스를 고유하며 == 로 비교 불가함.
         * ㄴ == 는 스택 영역의 레퍼런스를 비교함
         * String 리터럴, String 객체를 제외한 모든 객체의 해쉬코드는 고유하여 equals 로 비교 불가함
         * ㄴ equals 는 힙 영역에 생긴 Object 객체의 해쉬코드를 비교함
         */
        System.out.println("=========================================");
        String str1 = "test";
        String str2 = "test";
        System.out.println("str1==str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + (str1.equals(str2)));
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("=========================================");
    }
}
