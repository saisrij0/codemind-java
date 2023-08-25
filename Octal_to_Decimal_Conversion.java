import java.util.Scanner;
public class Decimal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,r,c=0;
        while(n!=0)
        {
            r=n%10;
            s=s+r*((int)Math.pow(8,c));
            n=n/10;
            c++;
        }
        System.out.println(s);
    }
}