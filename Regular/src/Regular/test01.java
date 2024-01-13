package Regular;

public class test01
{
    public static void main(String[] args)
    {
        System.out.println("a".matches("[abc]"));
        System.out.println("e".matches("[abcd]"));
        String a;
        a = "16630979651";
        System.out.println(a.matches("(1[3-9]\\d{9})|(0\\d{2}-?\\d{8})"));
        a = "dsadklas";
        System.out.println(a.matches("[a-zA-Z]{8}"));
    }

    public static boolean checkQQ(String QQ)
    {
        if (QQ == null || QQ.startsWith("0") || QQ.length() > 11 || QQ.length() < 5)
        {
            return false;
        }
        for (int i = 0 ; i < QQ.length() ; i++)
        {
            if (QQ.charAt(i) < '0' || QQ.charAt(i) > '9')
            {
                return false;
            }
        }
        return true;
    }
}
