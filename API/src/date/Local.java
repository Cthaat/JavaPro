package date;

import java.time.*;

public class Local
{
    public static void main(String[] args)
    {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime dlt = LocalDateTime.now();
        System.out.println(dlt);
        System.out.println(ld.getMonth());
        ZoneId Id = ZoneId.systemDefault();
        System.out.println(Id);
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId Id1 = ZoneId.of("Asia/Aden");
        ZonedDateTime now = ZonedDateTime.now(Id1);
        System.out.println(now);
    }
}
