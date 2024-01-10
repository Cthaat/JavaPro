package date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class dur
{
    public static void main(String[] args)
    {
        Duration a = Duration.between(LocalDateTime.of(2023, 1, 1 , 11 , 10 , 10), LocalDateTime.of(2023, 1, 10 , 11 , 10 , 15));
        System.out.println(a.toDays());
        System.out.println(a.toHours());
        System.out.println(a.toNanos());
    }
}
