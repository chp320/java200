package org.list.ex096;

public class SeasonStringMain {
    public static void main(String[] args) {
        SeasonString season = SeasonString.AUTUMN;      // ordinal: 2

        System.out.println(season.getMonth());
        System.out.println(season);

        System.out.println("============================================");

        System.out.println(season.equals(SeasonString.SPRING));
        System.out.println(season.equals(SeasonString.AUTUMN));

        System.out.println("============================================");

        System.out.println(season.compareTo(SeasonString.SPRING));  // season.ordinal() - SeasonString.SPRING.ordinal() 즉, 상수값을 빼주는 것이라고 보면 됨 !!
        System.out.println(season.compareTo(SeasonString.SUMMER));  // autumn(2) - summer(1) = 1
        System.out.println(season.compareTo(SeasonString.AUTUMN));  // autumn(2) - autumn(2) = 0
        System.out.println(season.compareTo(SeasonString.WINTER));  // autumn(2) - winter(3) = -1

        System.out.println("============================================");

        System.out.println(season.ordinal());   // 2
        System.out.println(season.name());      // enum의 변수명을 반환. AUTUMN
        System.out.println(SeasonString.AUTUMN.name());
        System.out.println(SeasonString.valueOf("AUTUMN"));     // 매개변수로 전달된 String과 일치하는 상수값을 반환

        System.out.println("============================================");

        for (SeasonString value : SeasonString.values()) {          // enum 객체의 상수들을 객체 배열로 반환
            System.out.println(value);
        }

    }
}
