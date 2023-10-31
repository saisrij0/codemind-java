import java.util.Scanner;
public class MoveZeroes
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
        int c=0;
        int brr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                brr[c]=arr[i];
                c+=1;
            }
        }
        for(int j=c;j<n;j++)
        {
            brr[j]=0;
        }
        for(int i:brr)
        {
            System.out.print(i+" ");
        }
    }
}