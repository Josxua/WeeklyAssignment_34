import java.util.Scanner;
public class Level_1_Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  num1=input.nextInt();
        int  num2=input.nextInt();
        int  num3=input.nextInt();
        System.out.print("Is the first number largest? ");
        if(num1>num2 && num1>num3)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}