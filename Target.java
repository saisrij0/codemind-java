import java.util.Scanner;
public class Target
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        sc.close();
        if(a>=10 && b>=10 && c>=10 && d>=10)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}