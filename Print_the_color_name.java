import java.util.Scanner;
public class Colors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char co=sc.next().charAt(0);
        sc.close();
        if(co=='V' || co=='v')
        {
            System.out.println("Violet");
        }
        else if(co=='I' || co=='i')
        {
            System.out.println("Indigo");
        }
        else if(co=='B' || co=='b')
        {
            System.out.println("Blue");
        }
        else if(co=='G' || co=='g')
        {
            System.out.println("Green");
        }
        else if(co=='Y' || co=='y')
        {
            System.out.println("Yellow");
        }
        else if(co=='O' || co=='o')
        {
            System.out.println("Orange");
        }
        else if(co=='R' || co=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}