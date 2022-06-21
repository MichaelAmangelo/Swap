import java.util.Arrays;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int[] arr = new int[]{2, 3, 9, 17, 32, 40, 73, 40, 21, 10};

        int n = 1;

        System.out.println("Before shifting");

        //   System.out.println("Original Array:");  displays og arr.//

        //Displays original array
        //System.out.println("Original array: ");//

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward left
        for (int i = 0; i < n; i++)
        {
            int j, first;
            //Stores the first element of the array
            first = arr[0];

            for (j = 0; j < arr.length - 1; j++)
            {
                //Shift element of array by one
                arr[j] = arr[j + 1];
            }
            //First element of array will be added to the end
            arr[j] = first;
        }

        System.out.println();

        //Displays resulting array after shift
        System.out.println("After shifting ");

        for (int i = 0; i < arr.length; i++)

        {
            System.out.print(arr[i] + " ");
        }

    }

}


