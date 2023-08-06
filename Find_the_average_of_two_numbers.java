import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        Scanner ag=new Scanner(System.in);
        float a,b;
        a=ag.nextFloat();
        b=ag.nextFloat();
        double c;
        c=(a+b)/2;
        System.out.printf("%7.4f",c);
    }
}