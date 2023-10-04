import java.util.Scanner;
public class CollatzSequence2{
    public static int Collatz(int n)
    {
        int co=0;
        while(n>1)
        {
            co+=1;
            if(n%2==0)
            {
                n=n/2;
            }
            else if(n==1)
            {
                break;
            }
            else{
                n=3*n+1;
            }
        }
        return co;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=0,f=a;
        for(int i=a;i<=b;i++)
        {
            int c=Collatz(i);
            if(c>max)
            {
                max=c;
                f=i;
            }
        }
        System.out.println(f);
    }
}