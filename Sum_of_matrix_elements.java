import java.util.Scanner;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n,s=0;
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] intArray=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                intArray[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                s+=intArray[i][j];
            }
        }
        System.out.println(s);
    }
}