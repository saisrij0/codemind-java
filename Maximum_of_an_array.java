import java.util.Scanner;
public class max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int s:a)
        {
            if(s>max)
            {
                max=s;
            }
        }
        System.out.println(max);
    }
}