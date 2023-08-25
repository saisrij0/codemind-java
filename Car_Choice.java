import java.util.Scanner;
public class CarChoice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x1,x2,y1,y2;
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            double c1,c2;
            c1=(double)y1/x1;
            c2=(double)y2/x2;
            if(c1==c2)
            {
                System.out.println("0");
            }
            else if(c1>c2)
            {
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }
    }
}