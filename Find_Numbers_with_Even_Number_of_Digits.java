import java.util.Scanner;
public class EvenNumberOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int dc=0;
        for(int e:arr)
        {
            int c=0;
            while(e>0)
            {
                c+=1;
                e=e/10;
            }
            if(c%2==0)
            {
                dc++;
            }
        }
        System.out.println(dc);
    }
}