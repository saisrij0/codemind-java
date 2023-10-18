import java.util.Scanner;
public class DisplayUniqueValues
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0,d=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                d=1;
                System.out.printf("%d ",arr[i]);
            }
        }
        if(d==0)
        {
            System.out.println("-1");
        }
    }
}