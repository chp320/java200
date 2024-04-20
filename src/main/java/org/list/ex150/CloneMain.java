package org.list.ex150;

public class CloneMain {
    public static void main(String[] args) {
        Student st = new Student("새새", 6, "서울 동작구 방앗간리");
        System.out.println("1. " + st);

        Student st1 = st;       // 참조(reference)에 의한 대입. 즉, st1은 st가 가리키는 동일한 값을 바라보고 있어 st1의 값 변경 시, st의 값도 변경됨 → '뮤터블(mutable)'
        st1.setAddress("경기 고양시");
        st1.setId(3);
        System.out.println("2. " + st);
        // 짜잔. 맞지? st1 에서 값을 수정 후, st 의 내용을 찍었는데 수정된 값 그대로 나오지?? "깊은 복사" 라고 함

        Student st2 = (Student) st.clone(); // "얕은 복사" → 새로운 객체를 만든 후, "값"만 복사하는 방식으로 st2 에서 값을 변경해도 st 의 값 변경 x. 자바에서는 기본적으로 '얕은 복사' 제공
        System.out.println("3. " + st2);
        // 값 변경
        st2.setAddress("서울 운동장");
        st2.setId(5);
        System.out.println("4. " + st);
        System.out.println("5. " + st2);
        // 거봐. st2 의 값을 수정하였지만 st 의 내용을 찍어보면 전~~혀 무관함을 알 수 있음
    }
}
