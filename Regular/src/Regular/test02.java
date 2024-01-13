package Regular;

import java.util.regex.Pattern;

public class test02
{
    public static void main(String[] args)
    {

    }
    public static void method1()
    {
        String regu = "(1[3-9]\\d{9})|(0\\d{2,7}-?\\d{7})|(\\w{2,}@\\w{2,20}\\.\\w{2,6})";
        Pattern pattern = Pattern.compile(regu);
    }
}
