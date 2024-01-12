package algs;

import javax.net.ssl.CertPathTrustManagerParameters;
import java.util.Arrays;

public class test01
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {5 , 4 , 9 , 5 , 1 , 3 , 6 , 1 , 8 , 9 , 3};
        for (int i = 0 ; i < arr.length - 1 ; i++)
        {
            for (int j = i + 1 ; j < arr.length ; j++)
            {
                if (arr[i] > arr[j])
                {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(find(arr , 9));
    }

    public static int find(int[] arr , int value)
    {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right)
        {
            int center = (left + right) / 2;
            if (arr[center] > value)
            {
                right = center - 1;
            }
            if (arr[center] < value)
            {
                left = center + 1;
            }
            if (arr[center] == value)
            {
                return center;
            }
        }
        return -1;
    }
}
