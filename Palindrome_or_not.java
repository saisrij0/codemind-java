import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String s=a.toLowerCase();
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        if(r.compareTo(s)==0)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}