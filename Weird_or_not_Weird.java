import java.util.Scanner;
public class Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            if(n>=2 && n<=5)
            {
                System.out.println("not weird");
            }
            else if(n>=6 && n<=20)
            {
                System.out.println("weird");
            }
            else{
                System.out.println("not weird");
            }
        }
        else{
            System.out.println("weird");
        }
    }
}