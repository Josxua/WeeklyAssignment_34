import java.util.Scanner;
public class Level_2_Q3
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 6; i<=9; i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        sc.close();
    }

    
}
