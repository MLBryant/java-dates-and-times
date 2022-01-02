package com.masonBryant.currentdate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WorldClockDriver {

    public static void main(String[] args) {
        WorldClock worldClock = new WorldClock();

        DateTimeFormatter date = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

        System.out.println("nowLocalDate = " + date.format(worldClock.getNowForDate()));
        System.out.println("nowLocalDateTime = " + dateTime.format(worldClock.getNowForDateAndTime()));

        System.out.println("\nnowLocalDate.getDayOfWeek() = " + worldClock.getDayOfWeekForNow());
        System.out.println("nowLocalDate.getDayOfMonth() = " + worldClock.getDayOfMonthForNow());
        System.out.println("nowLocalDate.getDayOfYear() = " + worldClock.getDayOfYearForNow());
    }
}
