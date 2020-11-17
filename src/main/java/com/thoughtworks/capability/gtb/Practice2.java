package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

    public static LocalDate getNextWorkDate(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekValue = dayOfWeek.getValue();
        if (dayOfWeekValue < 5) {
            return date.plusDays(1);
//      return LocalDate.ofYearDay(date.getYear(),date.getDayOfYear()+1);
        } else {
            return date.plusDays(8 - dayOfWeekValue);
        }
    }
}
