package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Forma
{
    public static void main(String[] args)
    {
        DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime lt = LocalDateTime.now();
        String b = a.format(lt);
        System.out.println(b);
    }
}
