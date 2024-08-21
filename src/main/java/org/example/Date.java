package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        String dateTimeString = "31.07.2016 14:15 GMT+02:00";
        DateTimeFormatter zonedFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm 'GMT'xxx");

        // Parse the date-time string into an OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString, zonedFormatter);

        // Get the total offset in seconds
        int totalSecondsOffset = offsetDateTime.getOffset().getTotalSeconds();

        // Print the total offset in seconds
        System.out.println("Total Offset in Seconds: " + totalSecondsOffset);
    }
}

