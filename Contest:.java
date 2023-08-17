import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        int a,b,x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        if((a*1+b*2)>=x)
        {
            System.out.println("Qualify");
        }
        else{
            System.out.println("Not Qualify");
        }
    }
}