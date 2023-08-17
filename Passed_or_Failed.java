import java.util.Scanner;
public class Exam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        int cs=sc.nextInt();
        sc.close();
        if(e>34 && m>34 && p>34 && c>34 && cs>34)
        {
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
    }
}