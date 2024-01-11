package date;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class arr
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {1 , 2 , 3 , 4 , 5};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOfRange(arr , 1 , 4);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr , 30);
        System.out.println(Arrays.toString(arr3));
        double[] arr4 = new double[] {1.5 , 2.5 , 3.5};
        Arrays.setAll(arr4 , value -> value * 2);
        System.out.println(Arrays.toString(arr4));
        Integer[] arr5 = new Integer[] {9 , 1 , 6 , 51 , 9 , 12 , 6 , 16 , 1 , 6};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
        com c = new com();
        Arrays.sort(arr5 , c::compare1);
        System.out.println(Arrays.toString(arr5));
    }
}
