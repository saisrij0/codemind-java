import java.util.Scanner;
public class Climate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>20)
        {
            System.out.println("HOT");
        }
        else{
            System.out.println("COLD");
        }
    }
}