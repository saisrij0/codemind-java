import java.util.Scanner;
public class Season
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=4 && n<=6)
        {
            System.out.println("Summer");
        }
        if(n>=7 && n<=10)
        {
            System.out.println("Rainy");
        }
        if(n==11 || n==12 || n==1)
        {
            System.out.println("Winter");
        }
        if(n==2 || n==3)
        {
            System.out.println("Spring");
        }
        if(n>12)
        {
            System.out.println("-1");
        }
    }
}