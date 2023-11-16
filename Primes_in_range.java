import java.util.Scanner;
public class PrimesInRange
{
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(isPrime(i) && i!=1)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}