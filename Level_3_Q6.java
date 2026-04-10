import java.util.Scanner;
public class Level_3_Q6 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        System.out.print("Number of digits: " + count);
        sc.close();
    }
}
