import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.toLowerCase();
        String[] c=b.split(" ");
        int res=0;
        for(String i:c)
        {
            String d="";
            for(int j=i.length()-1;j>=0;j--)
            {
                d+=i.charAt(j);
            }
            if(d.compareTo(i)==0)
            {
                res++;
            }
        }
        System.out.println(res);
    }
}