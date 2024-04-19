package org.list.ex111;

/** equals, hashCode 메서드 오버라이딩
 *  - 주제: 객체끼리 같은지 비교한다.
 *  - 객체는 equals, hashCode 메서드를 오버라이딩해야 비교 가능하다.
 */
public class Point1 {
    private double x;
    private double y;

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point1(Point1 xp) {
        this.x = xp.getX();
        this.y = xp.getY();
    }

    private double getX() {
        return x;
    }

    private double getY() {
        return 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
