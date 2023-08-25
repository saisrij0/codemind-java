import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println(s);
    }
}