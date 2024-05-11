package org.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInJava {

    public static void main(String[] args) {
        // 자바에서 리스트를 만드는 방식 - 생성자 방식, 메서드 방식
        // 1. 생성자 방식 -> 리스트 객체를 인스턴스화
        List<Number> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // 2. 메서드 방식 : Arrays 클래스의 asList 메서드 => 배열을 리스트로 변환함 !
        List<Number> asList = Arrays.asList(1, 2, 3);

        // 3. 메서드 방식 : List 인터페이스의 of 메서드 (jdk 9+) => 정적 팩토리 메서드 !
        List<Number> listOf = List.of(1, 2, 3);

        /*
         * 생성자 방식 vs 메서드 방식
         * - 생성자로 리스트 만드는 것과 달리 메서드로 리스트 만들면 "불변 리스트"가 된다
         * - 즉, 이후 요소(element)를 추가/삭제 가 불가능!!
         * - 그런데 말입니다 ..
         * - Arrays.asList 는 "메서드 방식" 이긴 하지만 set() 동작에 대해서는 가능 !
         * - List.of 는 "완벽히" 불가능한 "불변 리스트" 임 !!
         */
    }
}
