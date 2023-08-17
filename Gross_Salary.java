import java.util.Scanner;
public class Salary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double bs,da,hra,gs;
        bs=sc.nextDouble();
        if(bs<=10000)
        {
            da=bs*0.80;
            hra=bs*0.20;
        }
        else if(bs>10000 && bs<=20000)
        {
            da=bs*0.90;
            hra=bs*0.25;
        }
        else{
            da=bs*0.95;
            hra=bs*0.30;
        }
        gs=bs+da+hra;
        System.out.printf("%.2f",gs);
    }
}