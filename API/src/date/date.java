package date;

import java.util.Date;

public class date
{
    public static void main(String[] args)
    {
        Date d = new Date();
        System.out.println(d);
        long time = d.getTime();
        time += 2*1000;
        d.setTime(time);
        System.out.println(d);
    }
}
