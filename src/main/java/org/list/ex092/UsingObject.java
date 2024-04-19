package org.list.ex092;

/* 클래스에 대한 모든 정보를 구체적으로 보여주는 클래스는 java.lang.reflect 패키지 내에 존재한다.
 * 또한 생성자의 이름, 개수, 아규먼트 등 생성자에 대한 모든 정보는 java.lang.reflect.Constructor 를 이용해 얻을 수 있다.
 * 클래스에 대한 "모든" 정보를 얻는 것을 '리플렉션(reflection)' 이라고 한다.
 */
import java.lang.reflect.Constructor;

/** Object 클래스
 *  - 주제: Object에 있는 모든 컨스트럭트를 출력
 *  - Object 클래스는 java.lang 패키지에 존재
 */
public class UsingObject {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
    }
}
