import java.util.Scanner;
public class Monopoly
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a==b && a==c)
            {
                System.out.println("NO");
            }
            else if(a>b+c || b>a+c || c>a+b)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}