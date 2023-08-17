import java.util.Scanner;
public class Factor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n!=0)
        {
            s=s+n%10;
            n=n/10;
        }
        if(s%9==0)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}