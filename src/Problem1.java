import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer x");
        int x = scan.nextInt();

        for(int i =1; i<=x; i++)
        {
            if(i % 2 !=0)
            {
                if(i % 3 ==0)
                {
                    System.out.println(i + "Is a multiple of three");
                }
            }
        }
    }

}

