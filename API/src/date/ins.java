package date;

import java.time.Instant;

public class ins
{
    public static void main(String[] args)
    {
        Instant sec = Instant.now();
        long second = sec.getEpochSecond();
        System.out.println(second);
        int non = sec.getNano();
        System.out.println(non);
    }
}
