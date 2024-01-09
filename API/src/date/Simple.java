package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple
{
    public static void main(String[] args)
    {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String r = s.format(d);
        System.out.println(r);
    }
}
