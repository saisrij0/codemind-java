import java.util.*;
public class SquareArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] brr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            brr[i]=arr[i]*arr[i];
        }
        Arrays.sort(brr);
        for(int e:brr)
        {
            System.out.printf("%d ",e);
        }
    }
}