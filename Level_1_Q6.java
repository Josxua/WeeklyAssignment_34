import java.util.Scanner;
public class Level_1_Q6 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        if(n>0)
        {
            System.out.print("Positive");
        }
        else if(n<0)
        {
            System.out.println("Negative");
        }
        else 
        {
            System.out.println("Zero");  
        }
        input.close();      
    }

}