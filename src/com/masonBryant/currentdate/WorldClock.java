package com.masonBryant.currentdate;

import java.time.*;

public class WorldClock {

    public LocalDate getNowForDate() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalDateTime getNowForDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    public DayOfWeek getDayOfWeekForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getMonthValue();
    }

    public int getDayOfYearForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        return getNowDatetimeWithZoneId("America/New_York");
    }

    public ZonedDateTime getNowDateTimeForLA() {
        return getNowDatetimeWithZoneId("America/Los_Angeles");}

    public ZonedDateTime getNowDateTimeForLondond() {
        return getNowDatetimeWithZoneId("Europe/London");
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        return getNowDatetimeWithZoneId("Europe/Moscow");
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        return getNowDatetimeWithZoneId("Asia/Tokyo");
    }

    private ZonedDateTime getNowDatetimeWithZoneId(String zoneId) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime zonedDateTime = now.withZoneSameInstant(ZoneId.of(zoneId));
        return zonedDateTime;
    }
}
