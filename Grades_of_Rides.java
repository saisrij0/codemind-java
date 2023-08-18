import java.util.Scanner;
public class Grades
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h,sp,s;
        h=sc.nextInt();
        sp=sc.nextInt();
        s=sc.nextInt();
        if(h>50 && sp>60 && s>100)
        {
            System.out.println("10");
        }
        else if(h>50 && sp>60)
        {
            System.out.println("9");
        }
        else if(sp>60 && s>100)
        {
            System.out.println("8");
        }
        else if(h>50 && s>100)
        {
            System.out.println("7");
        }
        else if(h>50 || sp>60 || s>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}