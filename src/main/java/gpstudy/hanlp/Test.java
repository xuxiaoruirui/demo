package gpstudy.hanlp;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Test {
    public static void main(String[] args) {
    /*    long start = System.currentTimeMillis();
// doSomthing
        String a="España talava tvitoria tCalle Libertad 9 NO.4 01002";
        String b="España talava vitoria Calle Libertad 9 NO.4 0002";
       Double s= SimilarityUtil.getSimilarity(a,b)*100;

       System.out.println(s.intValue());
       System.out.println(System.currentTimeMillis() -start);*/
        Timestamp delayDeliveryTime=new Timestamp(1586933039000L) ;
        Instant instant = Instant.ofEpochMilli(delayDeliveryTime.getTime());
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        Timestamp time = Timestamp.valueOf(LocalDateTime.now());
        localDateTime.getDayOfYear();
        localDateTime.getDayOfMonth();
        String m=localDateTime.getMonth().name();

        System.out.println(new StringBuilder().append(m.charAt(0)).append(m.substring(1).toLowerCase())+" "+ localDateTime.getDayOfMonth()+", "+localDateTime.getYear());
    }
}
