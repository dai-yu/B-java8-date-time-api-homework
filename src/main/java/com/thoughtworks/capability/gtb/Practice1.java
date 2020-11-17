package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        LocalDate laborDay = LocalDate.of(2020, 5, 1);
        int laborDayDayOfYear = laborDay.getDayOfYear();
        int dayOfYear = date.getDayOfYear();
        int differernce = laborDayDayOfYear - dayOfYear;
        if (differernce < 0) {
            int nextLaborDayDaOfYear = laborDay.withYear(date.plusYears(1).getYear()).getDayOfYear();
            if (date.isLeapYear()) {
                return 366 - dayOfYear + nextLaborDayDaOfYear;
            } else {
                return 365 - dayOfYear + nextLaborDayDaOfYear;
            }
        } else {
            return differernce;
        }
    }
}
