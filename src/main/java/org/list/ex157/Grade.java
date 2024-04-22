package org.list.ex157;

/**
 * Comparable 인터페이스
 * - 객체간 크기 비교를 위해서는 Comparable 인터페이스를 이용하며,
 * - 추상 메서드 compareTo 를 구현해야 함
 */
public class Grade implements Comparable {

    private double kor;     // 국어
    private double eng;     // 영어
    private double math;    // 수학
    private double total;   // 총점
    private double avg;     // 평균

    public Grade(double kor, double eng, double math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public Grade() {
        this(0, 0, 0);
    }

    public double getKor() {
        return kor;
    }

    public double getEng() {
        return eng;
    }

    public double getMath() {
        return math;
    }

    public double getTotal() {
        total = (this.kor + this.eng + this.math);
        return total;
    }

    public double getAvg() {
        avg = getTotal() / 3.0;
        return avg;
    }

    public void setKor(double kor) {
        this.kor = kor;
        // 과목 성적이 변경되면 총점 및 평균을 재계산한다.
        getAvg();
    }

    public void setEng(double eng) {
        this.eng = eng;
        // 과목 성적이 변경되면 총점 및 평균을 재계산한다.
        getAvg();
    }

    public void setMath(double math) {
        this.math = math;
        // 과목 성적이 변경되면 총점 및 평균을 재계산한다.
        getAvg();
    }

    /**
     * 파라미터로 전달된 성적 값을 비교하여 기준 성적 값 대비 높음/낮음을 비교한다.
     * @param o the object to be compared.
     * @return -1 (기준 성적이 비교 성적보다 큰 경우)
     *          0 (기준 성적과 비교 성적이 동일한 경우)
     *          1 (기준 성적이 비교 성적보다 작은 경우)
     */
    @Override
    public int compareTo(Object o) {
        Grade grade = (Grade) o;    // 비교하기 위해 전달된 성적 값

        // 기준 값의 평균 성적
        double avg1 = this.avg;

        // 비교 값의 평균 성적
        double avg2 = grade.getAvg();

        // 비교 결과
        if (avg1 > avg2) {
            return -1;
        } else if (avg1 == avg2) {
            return 0;
        } else {
            return 1;
        }

    }
}
