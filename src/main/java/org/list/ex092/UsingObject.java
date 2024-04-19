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

        System.out.println(obj1.hashCode());
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1);
        System.out.println(obj2.toString());

        System.out.println(obj1.getClass().getName());  // 클래스 이름
        String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
        System.out.println(str);

        Object objstr = new String("Good");     // 다형성
        System.out.println(objstr.toString());          // 클래스명@hashCode...이 아니네;; String 객체인 경우 "문자열" 을 출력함
        System.out.println(objstr instanceof Object);
        System.out.println(objstr instanceof String);

        Class classes = obj1.getClass();
        System.out.println(classes.getName());          // 클래스 이름
        System.out.println("---------- constructor ----------");
        Constructor[] cons = classes.getDeclaredConstructors();     // 클래스의 모든 생성자를 리턴. 생성자에 대한 모든 정보는 java.lang.refelct.Constructor를 이용해 얻음. 모든 생성자를 리턴하기 때문에 배열로 받음
        System.out.println("> length of cons: " + cons.length);
        for (int i = 0; i < cons.length; i++) {
            System.out.println(cons[i].getName());
        }
        for (Constructor con : cons) {
            System.out.println(con.getName());
        }
    }
}
