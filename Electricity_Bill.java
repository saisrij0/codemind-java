import java.util.Scanner;
public class ElectricityBill
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int unit=sc.nextInt();
        double bill,tc;
        if(unit<199)
        {
            bill=unit*1.20;
        }
        else if(unit>=200 && unit<400)
        {
            bill=unit*1.50;
        }
        else if(unit>=400 && unit<600)
        {
            bill=unit*1.80;
        }
        else
        {
            bill=unit*2.00;
        }
        if(bill>400)
        {
            tc=bill+bill*0.15;
        }
        else{
            tc=bill+100;
        }
        System.out.printf("%.2f",tc);
    }
}