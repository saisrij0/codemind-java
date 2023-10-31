import java.util.Scanner;
public class DuplicateZeros
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
        int[] brr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(c<n)
            {
                if(arr[i]==0)
                {
                    brr[c]=0;
                    brr[c+1]=0;
                    c+=2;
                }
                else{
                    brr[c]=arr[i];
                    c+=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}