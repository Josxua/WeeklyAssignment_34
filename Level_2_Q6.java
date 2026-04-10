import java.util.Scanner;
public class Level_2_Q6
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int a1 = sc.nextInt();
        System.out.print("Enter Amars height in cm: ");
        int h1 = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int a2 = sc.nextInt();
        System.out.print("Enter Akbars height in cm: ");
        int h2 = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int a3 = sc.nextInt();
        System.out.print("Enter Anthonys height in cm: ");
        int h3 = sc.nextInt();
        if(a1<a2 && a1<a3)
            System.out.println("Amar is the youngest");
        else if (a2<a1 && a2<a3)
            System.out.println("Akbar is the youngest");
        else if (a3<a1 && a3<a2)
            System.out.println("Anthony is the youngest");

        if(h1>h2 && h1>h3)
            System.out.println("Amar is the tallest");
        else if (h2>h1 && h2>h3)
            System.out.println("Akbar is the tallest");
        else if (h3>h1 && h3>h2)
            System.out.println("Anthony is the tallest");
        sc.close();
    }

    
}
