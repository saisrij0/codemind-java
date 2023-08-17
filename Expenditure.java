import java.util.Scanner;
public class Expenditure
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
        if(x>=(y*30))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}