import java.util.Scanner;
public class min
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
        int min=a[0];
        for(int s:a)
        {
            if(s<min)
            {
                min=s;
            }
        }
        System.out.println(min);
    }
}