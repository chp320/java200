package org.list.ex196;

import org.list.ex165.InputsInt;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HCalendarConsole {

    int year = 2003;
    int month = 8;

    Calendar today;
    Calendar cal;

    public HCalendarConsole() {
        today = Calendar.getInstance();         // Calendar 는 abstract 클래스이기 때문에 객체 생성 불가함. 대신 getInstance() 사용!
        cal = new GregorianCalendar();

        calInput();
        calSet();
    }

    private void calSet() {
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, (month - 1));   // 1월(0) ~ 12월(11) 까지 임.
        cal.set(Calendar.DATE, 1);              // 1일이 있는 '주'를 기준 !!
        System.out.println(cal.get(Calendar.YEAR) + "년/" + (cal.get(Calendar.MONTH) + 1) + "월");
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);      // 일~토 7일짜리 하겠음. 일요일(1),월요일(2),화요일(3),...,금요일(6),토요일(7)

        int j=0, k=0;
        int hopping = 0;
//        System.out.println(cal.getFirstDayOfWeek());
//        System.out.println(dayOfWeek);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        for (int i = cal.getFirstDayOfWeek(); i < dayOfWeek; i++) {
            j++;        // 일요일이면 j=0, 월요일이면 1, 화요일이면 2, ...
        }
        hopping = j;

        for (int kk = 0; kk < hopping; kk++) {
            System.out.print("\t");
        }

        for (int i = cal.getMinimum(Calendar.DAY_OF_MONTH); i <= cal.getMaximum(Calendar.DAY_OF_MONTH); i++) {
            cal.set(Calendar.DATE, i);
            if (cal.get(Calendar.MONTH) != month - 1) {
                break;      // 다음 달로 넘어가면 안됨
            }
            if (hopping == 0 && ((i - 1) / 7) == 0) {
                System.out.print(i + "\t");
            } else {
                if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
                    System.out.println();
                }
                System.out.print(i + "\t");
            }
        }
    }

    private void calInput() {
        InputsInt ins = new InputsInt();
        int[] a = ins.input(2, 0, 3000);        // 0~3000 사이의 수를 2개 입력 받음
        year = a[0];
        month = a[1];
    }
}
