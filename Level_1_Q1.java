import java.util.Scanner;
public class Level_1_Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        System.out.print("Is the number "+number+" divisible by 5? ");
        if(number%5==0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}