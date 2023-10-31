import java.util.Scanner;
public class PredictTheWinner
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
        int x=0,y=0,d;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                x+=arr[i];
            }
            else{
                y+=arr[i];
            }
        }
        if(x>y)
        {
            if((x-y)%4==0)
            {
                System.out.print("X");
            }
            else{
                System.out.print("Y");
            }
        }
        else{
            if((y-x)%4==0)
            {
                System.out.print("X");
            }
            else{
                System.out.print("Y");
            }
        }
    }
}