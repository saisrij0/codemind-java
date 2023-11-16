import java.util.Scanner;
public class UglyNumber
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
        int n=sc.nextInt();
        int c=0,c1=0;
        if(n<1)
        {
            System.out.println("Not Ugly Number");
        }
        else{
            for(int i=2;i<=n;i++)
            {
                if(isPrime(i) && n%i==0)
                {
                    c+=1;
                    if(i==2 || i==3 || i==5)
                    {
                        c1+=1;
                    }
                }
            }
            if(c==c1)
            {
                System.out.println("Ugly Number");
            }
            else{
                System.out.println("Not Ugly Number");
            }
        }
    }
}