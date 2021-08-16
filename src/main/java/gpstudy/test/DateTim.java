package gpstudy.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTim {
    public static void main(String[] args) {
        DateTimeFormatter ftf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("2018-05-29 13:52:50", ftf);
        System.out.println(LocalDateTime.from(parse).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }
}
