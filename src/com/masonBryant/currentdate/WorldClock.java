package com.masonBryant.currentdate;

import java.time.*;

public class WorldClock {

    public LocalDate getNowForDate() {
        return LocalDate.now();
    }

    public LocalDateTime getNowForDateAndTime() {
        return LocalDateTime.now();
    }

    public DayOfWeek getDayOfWeekForNow() {
        return LocalDateTime.now().getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        return LocalDateTime.now().getMonthValue();
    }

    public int getDayOfYearForNow() {
        return LocalDateTime.now().getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        return getNowDatetimeWithZoneId("America/New_York");
    }

    public ZonedDateTime getNowDateTimeForLA() {
        return getNowDatetimeWithZoneId("America/Los_Angeles");}

    public ZonedDateTime getNowDateTimeForLondon() {
        return getNowDatetimeWithZoneId("Europe/London");
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        return getNowDatetimeWithZoneId("Europe/Moscow");
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        return getNowDatetimeWithZoneId("Asia/Tokyo");
    }

    private ZonedDateTime getNowDatetimeWithZoneId(String zoneId) {
        return ZonedDateTime.now().withZoneSameInstant(ZoneId.of(zoneId));
    }
}
