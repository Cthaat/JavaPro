package ob;

public class example
{
    public static void main(String[] args)
    {
        System.out.println(getArr(new int[] {11 , 22 , 33}));
    }

    public static String getArr(int[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0 ; i < arr.length ; i++)
        {
            sb.append(i == arr.length - 1 ? arr[i] + "]" : arr[i] + ",");
        }
        return sb.toString();
    }
}
