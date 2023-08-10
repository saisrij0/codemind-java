import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int a,b,c;
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         double s,area;
         s=(a+b+c)/2.0;
         area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.printf("%.2f",area);
    }
}