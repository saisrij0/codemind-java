import java.util.Scanner;
public class Pretty
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b,c=0;
            a=read.nextInt();
            b=read.nextInt();
            for(int j=a;j<=b;j++)
            {
                if(j%10==2 || j%10==3 || j%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}