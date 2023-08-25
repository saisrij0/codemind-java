import java.util.Scanner;
public class series
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+(double)1/i;
        }
        System.out.printf("%.2f",s);
    }
}