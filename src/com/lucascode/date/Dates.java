package com.lucascode.date;

import java.time.*;

public class Dates {
    public static void main(String[] args){

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getSecond());




        //localdate
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


        //Creating Specif Dates
        LocalDateTime someDate = LocalDateTime.of(
                2000,
                Month.DECEMBER,
                1,
                14,
                55,
                22
        );

        System.out.println(someDate);

        //Working with dates - Australia


        for (String zone: ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }

        System.out.println("Local time in AUS - Brisbane"+ LocalDateTime.now());

        LocalDateTime nowInBrazil = LocalDateTime.now(ZoneId.of("Brazil/DeNoronha"));
        System.out.println("Local time now in Brazil: " + nowInBrazil);


        //Other way
        System.out.println(Instant.now());
        System.out.println();
    }
}
