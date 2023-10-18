import java.util.Scanner;
public class Pattern11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=65;i<65+n;i++)
        {
            for(int j=65;j<65+n;j++)
            {
                System.out.printf("%c ",i);
            }
            System.out.println();
        }
    }
}