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

        System.out.println("\nnowZonedDateTimeForNewYork = " + dateTime.format(worldClock.getNowDateTimeForNewYork()));
        System.out.println("nowZonedDateTimeForNewYork.getZone() = " + worldClock.getNowDateTimeForNewYork().getZone());

        System.out.println("\nnowZonedDateTimeForLA = " + dateTime.format(worldClock.getNowDateTimeForLA()));
        System.out.println("nowZonedDateTimeForLA.getZone() = " + worldClock.getNowDateTimeForLA().getZone());

        System.out.println("\nnowZonedDateTimeForLondon = " + dateTime.format(worldClock.getNowDateTimeForLondon()));
        System.out.println("nowZonedDateTimeForLondon.getZone() = " + worldClock.getNowDateTimeForLondon().getZone());

        System.out.println("\nnowZonedDateTimeForMoscow = " + dateTime.format(worldClock.getNowDateTimeForMoscow()));
        System.out.println("nowZonedDateTimeForMoscow.getZone() = " + worldClock.getNowDateTimeForMoscow().getZone());

        System.out.println("\nnowZonedDateTimeForTokyo = " + dateTime.format(worldClock.getNowDateTimeForTokyo()));
        System.out.println("nowZonedDateTimeForTokyo.getZone() = " + worldClock.getNowDateTimeForTokyo().getZone());
    }
}
