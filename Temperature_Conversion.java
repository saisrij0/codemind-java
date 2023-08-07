import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner temp=new Scanner(System.in);
        int c;
        c=temp.nextInt();
        double f;
        f=32+((c*9)/5.0);
        System.out.printf("%.2f",f);
    }
}