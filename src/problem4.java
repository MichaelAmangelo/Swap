import java.util.Arrays;
import java.util.Scanner;

public class problem4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int min = 2;
        int max = 75;
        int range = max - min + 1;

        int n;

        do{
            System.out.println("Enter an integer n greater than 10");
              n = scan.nextInt();

        } while(n<10);

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * range + min);
        }
        int sum = arr[2] + arr [5] + arr[7] + arr[9];

        System.out.println("Before Swap:");

        System.out.println(Arrays.toString(arr));

        System.out.println("Sum of all elements at indexes 2, 5, 7, and 9 is:" + sum);

        int temp;
        temp = arr[2];
        arr[2] = arr[6];
        arr [6] = temp;

        int temp2;
        temp2 = arr[4];
        arr[4] = arr[7];
        arr[7] = temp2;

         sum = arr[2] + arr [5] + arr[7] + arr[9];

        System.out.println("After Swap:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of all elements at indexes 2, 5, 7, and 9 is:" + sum);
        }
    }

